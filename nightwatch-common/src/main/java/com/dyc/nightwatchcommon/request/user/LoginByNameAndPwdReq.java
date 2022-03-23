package com.dyc.nightwatchcommon.request.user;

import java.util.Date;

public class LoginByNameAndPwdReq {

    String userName;
    String password;
    Date date;
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }



}
