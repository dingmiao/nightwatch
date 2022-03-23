package com.dyc.userservice.service;

import com.dyc.nightwatchcommon.dto.LoginDTO;
import com.dyc.nightwatchcommon.facade.user.LoginService;
import com.dyc.nightwatchcommon.request.user.LoginByNameAndPwdReq;
import com.dyc.userservice.entity.User;
import com.dyc.userservice.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginServiceImp implements LoginService {

    private final String NO_SUCH_USER = "no such user!";
    private final String PWD_ERROR = "password error!";
    private final String LOGIN_SUCCESS = "success";
    @Autowired
    UserMapper userMapper;

    @Override
    public LoginDTO login(LoginByNameAndPwdReq loginByNameAndPwdReq) {
        LoginDTO loginDTO = new LoginDTO();
        if (null == loginByNameAndPwdReq) {
            return null;
        }

        // 根据账号查询
        User user = userMapper.selectByAccountName(loginByNameAndPwdReq.getUserName());
        if (null == user || null == loginByNameAndPwdReq.getUserName()) {
            loginDTO.setMsg(NO_SUCH_USER);
            return loginDTO;
        }
        if (null == loginByNameAndPwdReq.getPassword() || !user.getAccountPassword().equals(loginByNameAndPwdReq.getPassword())) {
            loginDTO.setMsg(PWD_ERROR);
            return loginDTO;
        }
        // 验证成功
        loginDTO.setSuccess(Boolean.TRUE);
        loginDTO.setMsg(LOGIN_SUCCESS);
        loginDTO.setUser(user);
        return loginDTO;
    }
}
