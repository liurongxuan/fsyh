package com.example.fsyh.controller;

import com.example.fsyh.service.ApplyInfoService;
import com.example.fsyh.util.DateUtilrx;
import com.example.fsyh.util.IpUtilrx;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.fsyh.model.ApplyInfo;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ApplyController {
    @Resource
    private ApplyInfoService applyInfoService;

    @RequestMapping("/apply")
    public Object apply( HttpServletRequest request){
        String keep  = request.getParameter("keep");
        String sj = request.getParameter("sj");
        String pl = request.getParameter("pl");


        String ip = IpUtilrx.getIpAddr(request);
        String time = DateUtilrx.getTime();

        ApplyInfo record = new ApplyInfo();

        record.setApName(keep);
        record.setApIp(ip);
        record.setApTime(time);
        record.setApKm(pl);
        record.setApAdd1(sj);

        int res = applyInfoService.insertSelective(record);

        System.out.println("插入申请数据第"+res+"条");
        Map<String,Object> params = new HashMap<>();
        params.clear();

        if (res>0){
            params.put("state",1);
            return params;
        }else {
            params.put("state",0);
            return params;
        }

    }
}
