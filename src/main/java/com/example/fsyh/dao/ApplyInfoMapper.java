package com.example.fsyh.dao;

import com.example.fsyh.model.ApplyInfo;

public interface ApplyInfoMapper {
    int deleteByPrimaryKey(Integer apId);

    int insert(ApplyInfo record);

    int insertSelective(ApplyInfo record);

    ApplyInfo selectByPrimaryKey(Integer apId);

    int updateByPrimaryKeySelective(ApplyInfo record);

    int updateByPrimaryKey(ApplyInfo record);
}