package com.softwareengineering.musicplayer.bean;

import java.sql.Blob;
import java.sql.Date;

public class User {
    private Integer userId;
    private String userPasswd;
    private String userName;
    private Blob userFace=null;
    private String userAdress=null;
    private String userTel=null;
    private String userEmail=null;
    private String  userBirthday=null;
    private String userPersonalProfile=null;
    private String userSex=null;


    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public Blob getUserFace() {
        return userFace;
    }

    public void setUserFace(Blob userFace) {
        this.userFace = userFace;
    }

    public String getUserAdress() {
        return userAdress;
    }

    public void setUserAdress(String userAdress) {
        this.userAdress = userAdress;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(String userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserPersonalProfile() {
        return userPersonalProfile;
    }

    public void setUserPersonalProfile(String userPersonalProfile) {
        this.userPersonalProfile = userPersonalProfile;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserPasswd() {
        return userPasswd;
    }

    public void setUserPasswd(String userPasswd) {
        this.userPasswd = userPasswd;
    }

    public User() {
    }
}
