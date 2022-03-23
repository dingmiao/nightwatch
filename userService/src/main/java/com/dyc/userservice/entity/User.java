package com.dyc.userservice.entity;

import java.util.Date;

public class User {
    private Long id;

    private String accountName;

    private String accountPassword;

    private String mailAddress;

    private String userTrueName;

    private String userNickName;

    private String userSchoolName;

    private String userCollegeName;

    private String userCompanyName;

    private Byte level;

    private Integer schoolAdmissionYear;

    private String gender;

    private String avatarUrl;

    private Date gmtCreate;

    private Date gmtModified;

    private String wxOpenid;

    private String phonenumber;

    public User(Long id, String accountName, String accountPassword, String mailAddress, String userTrueName, String userNickName, String userSchoolName, String userCollegeName, String userCompanyName, Byte level, Integer schoolAdmissionYear, String gender, String avatarUrl, Date gmtCreate, Date gmtModified, String wxOpenid, String phonenumber) {
        this.id = id;
        this.accountName = accountName;
        this.accountPassword = accountPassword;
        this.mailAddress = mailAddress;
        this.userTrueName = userTrueName;
        this.userNickName = userNickName;
        this.userSchoolName = userSchoolName;
        this.userCollegeName = userCollegeName;
        this.userCompanyName = userCompanyName;
        this.level = level;
        this.schoolAdmissionYear = schoolAdmissionYear;
        this.gender = gender;
        this.avatarUrl = avatarUrl;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
        this.wxOpenid = wxOpenid;
        this.phonenumber = phonenumber;
    }

    public User() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword == null ? null : accountPassword.trim();
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress == null ? null : mailAddress.trim();
    }

    public String getUserTrueName() {
        return userTrueName;
    }

    public void setUserTrueName(String userTrueName) {
        this.userTrueName = userTrueName == null ? null : userTrueName.trim();
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName == null ? null : userNickName.trim();
    }

    public String getUserSchoolName() {
        return userSchoolName;
    }

    public void setUserSchoolName(String userSchoolName) {
        this.userSchoolName = userSchoolName == null ? null : userSchoolName.trim();
    }

    public String getUserCollegeName() {
        return userCollegeName;
    }

    public void setUserCollegeName(String userCollegeName) {
        this.userCollegeName = userCollegeName == null ? null : userCollegeName.trim();
    }

    public String getUserCompanyName() {
        return userCompanyName;
    }

    public void setUserCompanyName(String userCompanyName) {
        this.userCompanyName = userCompanyName == null ? null : userCompanyName.trim();
    }

    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }

    public Integer getSchoolAdmissionYear() {
        return schoolAdmissionYear;
    }

    public void setSchoolAdmissionYear(Integer schoolAdmissionYear) {
        this.schoolAdmissionYear = schoolAdmissionYear;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getWxOpenid() {
        return wxOpenid;
    }

    public void setWxOpenid(String wxOpenid) {
        this.wxOpenid = wxOpenid == null ? null : wxOpenid.trim();
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }
}