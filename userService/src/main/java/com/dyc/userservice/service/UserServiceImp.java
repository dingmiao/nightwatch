package com.dyc.userservice.service;

import com.dyc.nightwatchcommon.dto.LoginDTO;
import com.dyc.nightwatchcommon.facade.user.UserService;
import com.dyc.nightwatchcommon.request.user.LoginByNameAndPwdReq;

public class UserServiceImp implements UserService {
    @Override
    public String test() {
        return "connection success!";
    }


    public Boolean userExist (String accountName) {
        if (null == accountName) {
            return false;
        }
        return null;
    }
}
