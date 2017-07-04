package com.model;


/**
 * Created by yuanjie.fang on 2017/7/4.
 */
public class AppUser {
    private String id;
    private String tpadId;
    private String loginName;

    public AppUser() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTpadId() {
        return tpadId;
    }

    public void setTpadId(String tpadId) {
        this.tpadId = tpadId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "id='" + id + '\'' +
                ", tpadId='" + tpadId + '\'' +
                ", loginName='" + loginName + '\'' +
                '}';
    }
}
