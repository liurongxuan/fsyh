package com.example.fsyh.serviceImpl;

import com.example.fsyh.service.LoginInfoService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.fsyh.model.LoginInfo;
import com.example.fsyh.dao.LoginInfoMapper;

@Service
public class LoginInfoServiceImpl implements LoginInfoService {
    @Resource
    private LoginInfoMapper loginInfoMapper;


    @Override
    public int insertSelective(LoginInfo record){
        return loginInfoMapper.insertSelective(record);
    }
}
