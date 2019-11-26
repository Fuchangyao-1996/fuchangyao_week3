package com.fuchangyao.pojo;

import java.io.Serializable;
import java.util.Date;

public class BoughtGoods implements Serializable{
    private Integer bid;

    private String gname;

    private Double gprice;

    private Integer gjifen;

    private String bgoumai;

    private String uname;

    private Date createdate;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public Double getGprice() {
        return gprice;
    }

    public void setGprice(Double gprice) {
        this.gprice = gprice;
    }

    public Integer getGjifen() {
        return gjifen;
    }

    public void setGjifen(Integer gjifen) {
        this.gjifen = gjifen;
    }

    public String getBgoumai() {
        return bgoumai;
    }

    public void setBgoumai(String bgoumai) {
        this.bgoumai = bgoumai;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}