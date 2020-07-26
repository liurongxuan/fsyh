package com.example.fsyh.model;

public class BbsInfo {
    private Integer bsId;

    private String bsDate;

    private String bsInfo;

    private String bsStatus;

    private String bsAdd1;

    private String bsAdd2;

    private String bsAdd3;

    public Integer getBsId() {
        return bsId;
    }

    public void setBsId(Integer bsId) {
        this.bsId = bsId;
    }

    public String getBsDate() {
        return bsDate;
    }

    public void setBsDate(String bsDate) {
        this.bsDate = bsDate == null ? null : bsDate.trim();
    }

    public String getBsInfo() {
        return bsInfo;
    }

    public void setBsInfo(String bsInfo) {
        this.bsInfo = bsInfo == null ? null : bsInfo.trim();
    }

    public String getBsStatus() {
        return bsStatus;
    }

    public void setBsStatus(String bsStatus) {
        this.bsStatus = bsStatus == null ? null : bsStatus.trim();
    }

    public String getBsAdd1() {
        return bsAdd1;
    }

    public void setBsAdd1(String bsAdd1) {
        this.bsAdd1 = bsAdd1 == null ? null : bsAdd1.trim();
    }

    public String getBsAdd2() {
        return bsAdd2;
    }

    public void setBsAdd2(String bsAdd2) {
        this.bsAdd2 = bsAdd2 == null ? null : bsAdd2.trim();
    }

    public String getBsAdd3() {
        return bsAdd3;
    }

    public void setBsAdd3(String bsAdd3) {
        this.bsAdd3 = bsAdd3 == null ? null : bsAdd3.trim();
    }
}