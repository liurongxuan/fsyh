package com.example.fsyh.model;

public class FinishInfo {
    private Integer fiId;

    private String fiName;

    private String fiKm;

    private String fiNum;

    private String fiTime;

    private String fiAdd1;

    private String fiAdd2;

    private String fiAdd3;

    public Integer getFiId() {
        return fiId;
    }

    public void setFiId(Integer fiId) {
        this.fiId = fiId;
    }

    public String getFiName() {
        return fiName;
    }

    public void setFiName(String fiName) {
        this.fiName = fiName == null ? null : fiName.trim();
    }

    public String getFiKm() {
        return fiKm;
    }

    public void setFiKm(String fiKm) {
        this.fiKm = fiKm == null ? null : fiKm.trim();
    }

    public String getFiNum() {
        return fiNum;
    }

    public void setFiNum(String fiNum) {
        this.fiNum = fiNum == null ? null : fiNum.trim();
    }

    public String getFiTime() {
        return fiTime;
    }

    public void setFiTime(String fiTime) {
        this.fiTime = fiTime == null ? null : fiTime.trim();
    }

    public String getFiAdd1() {
        return fiAdd1;
    }

    public void setFiAdd1(String fiAdd1) {
        this.fiAdd1 = fiAdd1 == null ? null : fiAdd1.trim();
    }

    public String getFiAdd2() {
        return fiAdd2;
    }

    public void setFiAdd2(String fiAdd2) {
        this.fiAdd2 = fiAdd2 == null ? null : fiAdd2.trim();
    }

    public String getFiAdd3() {
        return fiAdd3;
    }

    public void setFiAdd3(String fiAdd3) {
        this.fiAdd3 = fiAdd3 == null ? null : fiAdd3.trim();
    }
}