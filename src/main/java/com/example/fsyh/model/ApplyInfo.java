package com.example.fsyh.model;

public class ApplyInfo {
    private Integer apId;

    private String apName;

    private String apKm;

    private String apUpdateTime;

    private String apNum;

    private String apAdd1;

    private String apAdd2;

    private String apAdd3;

    private String apIp;

    private String apLocation;

    private String apTime;

    public Integer getApId() {
        return apId;
    }

    public void setApId(Integer apId) {
        this.apId = apId;
    }

    public String getApName() {
        return apName;
    }

    public void setApName(String apName) {
        this.apName = apName == null ? null : apName.trim();
    }

    public String getApKm() {
        return apKm;
    }

    public void setApKm(String apKm) {
        this.apKm = apKm == null ? null : apKm.trim();
    }

    public String getApUpdateTime() {
        return apUpdateTime;
    }

    public void setApUpdateTime(String apUpdateTime) {
        this.apUpdateTime = apUpdateTime == null ? null : apUpdateTime.trim();
    }

    public String getApNum() {
        return apNum;
    }

    public void setApNum(String apNum) {
        this.apNum = apNum == null ? null : apNum.trim();
    }

    public String getApAdd1() {
        return apAdd1;
    }

    public void setApAdd1(String apAdd1) {
        this.apAdd1 = apAdd1 == null ? null : apAdd1.trim();
    }

    public String getApAdd2() {
        return apAdd2;
    }

    public void setApAdd2(String apAdd2) {
        this.apAdd2 = apAdd2 == null ? null : apAdd2.trim();
    }

    public String getApAdd3() {
        return apAdd3;
    }

    public void setApAdd3(String apAdd3) {
        this.apAdd3 = apAdd3 == null ? null : apAdd3.trim();
    }

    public String getApIp() {
        return apIp;
    }

    public void setApIp(String apIp) {
        this.apIp = apIp == null ? null : apIp.trim();
    }

    public String getApLocation() {
        return apLocation;
    }

    public void setApLocation(String apLocation) {
        this.apLocation = apLocation == null ? null : apLocation.trim();
    }

    public String getApTime() {
        return apTime;
    }

    public void setApTime(String apTime) {
        this.apTime = apTime == null ? null : apTime.trim();
    }
}