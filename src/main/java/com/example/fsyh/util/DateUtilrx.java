package com.example.fsyh.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateUtilrx {
    public static  String getTime(){
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss ");
//        System.out.println("格式化输出：" + sdf.format(d));

        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
//        System.out.println("Asia/Shanghai:" + sdf.format(d));

//        return "格式化输出：" + sdf.format(d) + '\n' + "Asia/Shanghai:" + sdf.format(d);
        return sdf.format(d);
    }
}

