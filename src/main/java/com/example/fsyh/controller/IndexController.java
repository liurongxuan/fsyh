package com.example.fsyh.controller;

import com.example.fsyh.service.LoginInfoService;
import com.example.fsyh.util.DateUtilrx;
import com.example.fsyh.util.IpUtilrx;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.fsyh.model.LoginInfo;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {
    @Resource
    private LoginInfoService loginInfoService;

    @RequestMapping("/")
    public String index(Model model, HttpServletRequest request) {
        System.out.print("首页");
        String ip = IpUtilrx.getIpAddr(request);

        System.out.println(ip);

        String time = DateUtilrx.getTime();
        LoginInfo record = new LoginInfo();
        record.setLgIp(ip);
        record.setLgTime(time);

        loginInfoService.insertSelective(record);

        return "page-under-construction";
    }
}
