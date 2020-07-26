package com.example.fsyh.dao;

import com.example.fsyh.model.MessageInfo;

public interface MessageInfoMapper {
    int deleteByPrimaryKey(Integer msgId);

    int insert(MessageInfo record);

    int insertSelective(MessageInfo record);

    MessageInfo selectByPrimaryKey(Integer msgId);

    int updateByPrimaryKeySelective(MessageInfo record);

    int updateByPrimaryKey(MessageInfo record);
}