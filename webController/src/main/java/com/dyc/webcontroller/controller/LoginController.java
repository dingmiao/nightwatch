package com.dyc.webcontroller.controller;

import com.dyc.nightwatchcommon.dto.LoginDTO;
import com.dyc.nightwatchcommon.facade.user.LoginService;
import com.dyc.nightwatchcommon.facade.user.UserService;
import com.dyc.nightwatchcommon.request.user.LoginByNameAndPwdReq;
import com.dyc.webcontroller.util.RedisUtil;
import com.dyc.webcontroller.util.TokenUtil;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {

    @DubboReference(interfaceClass = UserService.class)
    UserService userService;
    @DubboReference(interfaceClass = LoginService.class)
    LoginService loginService;
    @Autowired
    RedisUtil redisUtil;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    @ResponseBody
    public String test() {
        return userService.test();
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public String login(HttpServletRequest request, HttpServletResponse response) {
        LoginByNameAndPwdReq loginByNameAndPwdReq = new LoginByNameAndPwdReq();
        loginByNameAndPwdReq.setUserName((String) request.getAttribute("userName"));
        loginByNameAndPwdReq.setUserName((String) request.getAttribute("password"));
        LoginDTO loginDTO = loginService.login(loginByNameAndPwdReq);
        addUserToCache(loginDTO, loginByNameAndPwdReq, response);

        return "";
    }

    private void addUserToCache(LoginDTO loginDTO, LoginByNameAndPwdReq loginByNameAndPwdReq, HttpServletResponse response) {
        if (loginDTO.getSuccess()) {
            Long currentTimeMillis = System.currentTimeMillis();
            String token= TokenUtil.sign(loginByNameAndPwdReq.getUserName(), currentTimeMillis);
            redisUtil.set(loginByNameAndPwdReq.getUserName(), currentTimeMillis, TokenUtil.REFRESH_EXPIRE_TIME);
            response.setHeader("Authorization", token);
            response.setHeader("Access-Control-Expose-Headers", "Authorization");
        }
    }

}
