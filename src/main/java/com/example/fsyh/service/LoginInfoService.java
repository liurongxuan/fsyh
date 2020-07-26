package com.example.fsyh.service;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.example.fsyh.model.LoginInfo;

@Mapper
@Repository
@Service
public interface LoginInfoService {
    int insertSelective(LoginInfo record);

}
