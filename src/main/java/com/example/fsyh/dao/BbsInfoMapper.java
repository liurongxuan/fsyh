package com.example.fsyh.dao;

import com.example.fsyh.model.BbsInfo;

public interface BbsInfoMapper {
    int deleteByPrimaryKey(Integer bsId);

    int insert(BbsInfo record);

    int insertSelective(BbsInfo record);

    BbsInfo selectByPrimaryKey(Integer bsId);

    int updateByPrimaryKeySelective(BbsInfo record);

    int updateByPrimaryKey(BbsInfo record);
}