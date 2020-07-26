package com.example.fsyh.dao;

import com.example.fsyh.model.PictureInfo;

public interface PictureInfoMapper {
    int deleteByPrimaryKey(Integer picId);

    int insert(PictureInfo record);

    int insertSelective(PictureInfo record);

    PictureInfo selectByPrimaryKey(Integer picId);

    int updateByPrimaryKeySelective(PictureInfo record);

    int updateByPrimaryKey(PictureInfo record);
}