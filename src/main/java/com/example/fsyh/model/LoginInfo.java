package com.example.fsyh.model;

public class LoginInfo {
    private Integer lgId;

    private String lgIp;

    private String lgLocation;

    private String lgAdd1;

    private String lgAdd2;

    private String lgAdd3;

    private String lgTime;

    public Integer getLgId() {
        return lgId;
    }

    public void setLgId(Integer lgId) {
        this.lgId = lgId;
    }

    public String getLgIp() {
        return lgIp;
    }

    public void setLgIp(String lgIp) {
        this.lgIp = lgIp == null ? null : lgIp.trim();
    }

    public String getLgLocation() {
        return lgLocation;
    }

    public void setLgLocation(String lgLocation) {
        this.lgLocation = lgLocation == null ? null : lgLocation.trim();
    }

    public String getLgAdd1() {
        return lgAdd1;
    }

    public void setLgAdd1(String lgAdd1) {
        this.lgAdd1 = lgAdd1 == null ? null : lgAdd1.trim();
    }

    public String getLgAdd2() {
        return lgAdd2;
    }

    public void setLgAdd2(String lgAdd2) {
        this.lgAdd2 = lgAdd2 == null ? null : lgAdd2.trim();
    }

    public String getLgAdd3() {
        return lgAdd3;
    }

    public void setLgAdd3(String lgAdd3) {
        this.lgAdd3 = lgAdd3 == null ? null : lgAdd3.trim();
    }

    public String getLgTime() {
        return lgTime;
    }

    public void setLgTime(String lgTime) {
        this.lgTime = lgTime == null ? null : lgTime.trim();
    }
}