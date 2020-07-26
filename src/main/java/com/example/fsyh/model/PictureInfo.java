package com.example.fsyh.model;

public class PictureInfo {
    private Integer picId;

    private String picNum;

    private String piTopic;

    private String piDate;

    private String piUrl;

    private String piStatus;

    private String piAdd1;

    private String piAdd2;

    private String piAdd3;

    public Integer getPicId() {
        return picId;
    }

    public void setPicId(Integer picId) {
        this.picId = picId;
    }

    public String getPicNum() {
        return picNum;
    }

    public void setPicNum(String picNum) {
        this.picNum = picNum == null ? null : picNum.trim();
    }

    public String getPiTopic() {
        return piTopic;
    }

    public void setPiTopic(String piTopic) {
        this.piTopic = piTopic == null ? null : piTopic.trim();
    }

    public String getPiDate() {
        return piDate;
    }

    public void setPiDate(String piDate) {
        this.piDate = piDate == null ? null : piDate.trim();
    }

    public String getPiUrl() {
        return piUrl;
    }

    public void setPiUrl(String piUrl) {
        this.piUrl = piUrl == null ? null : piUrl.trim();
    }

    public String getPiStatus() {
        return piStatus;
    }

    public void setPiStatus(String piStatus) {
        this.piStatus = piStatus == null ? null : piStatus.trim();
    }

    public String getPiAdd1() {
        return piAdd1;
    }

    public void setPiAdd1(String piAdd1) {
        this.piAdd1 = piAdd1 == null ? null : piAdd1.trim();
    }

    public String getPiAdd2() {
        return piAdd2;
    }

    public void setPiAdd2(String piAdd2) {
        this.piAdd2 = piAdd2 == null ? null : piAdd2.trim();
    }

    public String getPiAdd3() {
        return piAdd3;
    }

    public void setPiAdd3(String piAdd3) {
        this.piAdd3 = piAdd3 == null ? null : piAdd3.trim();
    }
}