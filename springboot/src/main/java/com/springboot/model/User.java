package com.springboot.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

public class User {
    @Null
    private Integer id;
    @NotNull
    private String loginName;
    private String passWord;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
        
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", loginName=" + loginName + ", passWord=" + passWord + "]";
    }

}
