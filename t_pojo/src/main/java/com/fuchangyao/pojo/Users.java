package com.fuchangyao.pojo;

import java.io.Serializable;

public class Users implements Serializable {
    private Integer uid;

    private String uname;

    private String upwd;

    private String uphone;

    private Double uyue;

    private Integer ujifen;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }

    public Double getUyue() {
        return uyue;
    }

    public void setUyue(Double uyue) {
        this.uyue = uyue;
    }

    public Integer getUjifen() {
        return ujifen;
    }

    public void setUjifen(Integer ujifen) {
        this.ujifen = ujifen;
    }
}