package com.example.fsyh.serviceImpl;

import com.example.fsyh.dao.ApplyInfoMapper;
import com.example.fsyh.model.ApplyInfo;
import com.example.fsyh.service.ApplyInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ApplyInfoServiceImpl implements ApplyInfoService{
    @Resource
    private ApplyInfoMapper applyInfoMapper;

    @Override
    public int insertSelective(ApplyInfo record){
        return applyInfoMapper.insertSelective(record);
    }
}
