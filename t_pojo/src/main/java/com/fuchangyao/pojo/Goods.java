package com.fuchangyao.pojo;

import java.io.Serializable;

public class Goods implements Serializable {
    private Integer gid;

    private String gname;

    private String gcontent;

    private Double gprice;

    private Integer gfen;

    private Integer gsum;

    private String path;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getGcontent() {
        return gcontent;
    }

    public void setGcontent(String gcontent) {
        this.gcontent = gcontent;
    }

    public Double getGprice() {
        return gprice;
    }

    public void setGprice(Double gprice) {
        this.gprice = gprice;
    }

    public Integer getGfen() {
        return gfen;
    }

    public void setGfen(Integer gfen) {
        this.gfen = gfen;
    }

    public Integer getGsum() {
        return gsum;
    }

    public void setGsum(Integer gsum) {
        this.gsum = gsum;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}