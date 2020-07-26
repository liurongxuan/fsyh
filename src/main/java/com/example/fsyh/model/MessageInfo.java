package com.example.fsyh.model;

public class MessageInfo {
    private Integer msgId;

    private String msgInfo;

    private String msgIp;

    private String msgTime;

    private String msgAdd1;

    private String msgAdd2;

    private String msgAdd3;

    public Integer getMsgId() {
        return msgId;
    }

    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    public String getMsgInfo() {
        return msgInfo;
    }

    public void setMsgInfo(String msgInfo) {
        this.msgInfo = msgInfo == null ? null : msgInfo.trim();
    }

    public String getMsgIp() {
        return msgIp;
    }

    public void setMsgIp(String msgIp) {
        this.msgIp = msgIp == null ? null : msgIp.trim();
    }

    public String getMsgTime() {
        return msgTime;
    }

    public void setMsgTime(String msgTime) {
        this.msgTime = msgTime == null ? null : msgTime.trim();
    }

    public String getMsgAdd1() {
        return msgAdd1;
    }

    public void setMsgAdd1(String msgAdd1) {
        this.msgAdd1 = msgAdd1 == null ? null : msgAdd1.trim();
    }

    public String getMsgAdd2() {
        return msgAdd2;
    }

    public void setMsgAdd2(String msgAdd2) {
        this.msgAdd2 = msgAdd2 == null ? null : msgAdd2.trim();
    }

    public String getMsgAdd3() {
        return msgAdd3;
    }

    public void setMsgAdd3(String msgAdd3) {
        this.msgAdd3 = msgAdd3 == null ? null : msgAdd3.trim();
    }
}