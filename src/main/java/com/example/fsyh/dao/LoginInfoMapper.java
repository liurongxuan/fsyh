package com.example.fsyh.dao;

import com.example.fsyh.model.LoginInfo;

public interface LoginInfoMapper {
    int deleteByPrimaryKey(Integer lgId);

    int insert(LoginInfo record);

    int insertSelective(LoginInfo record);

    LoginInfo selectByPrimaryKey(Integer lgId);

    int updateByPrimaryKeySelective(LoginInfo record);

    int updateByPrimaryKey(LoginInfo record);
}