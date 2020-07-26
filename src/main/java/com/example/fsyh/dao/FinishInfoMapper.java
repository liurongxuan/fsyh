package com.example.fsyh.dao;

import com.example.fsyh.model.FinishInfo;

public interface FinishInfoMapper {
    int deleteByPrimaryKey(Integer fiId);

    int insert(FinishInfo record);

    int insertSelective(FinishInfo record);

    FinishInfo selectByPrimaryKey(Integer fiId);

    int updateByPrimaryKeySelective(FinishInfo record);

    int updateByPrimaryKey(FinishInfo record);
}