package com.example.fsyh.service;

import com.example.fsyh.model.ApplyInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Mapper
@Repository
@Service
public interface ApplyInfoService {
    int insertSelective(ApplyInfo record);
}
