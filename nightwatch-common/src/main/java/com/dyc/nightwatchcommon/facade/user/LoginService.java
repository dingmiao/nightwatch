package com.dyc.nightwatchcommon.facade.user;

import com.dyc.nightwatchcommon.dto.LoginDTO;
import com.dyc.nightwatchcommon.request.user.LoginByNameAndPwdReq;

public interface LoginService {
    LoginDTO login(LoginByNameAndPwdReq loginByNameAndPwdReq);
}
