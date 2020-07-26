package com.example.fsyh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.fsyh.dao")
public class FsyhApplication {

    public static void main(String[] args) {
        SpringApplication.run(FsyhApplication.class, args);
    }

}
