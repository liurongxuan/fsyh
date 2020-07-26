package com.example.fsyh.util;

import java.util.HashMap;

public class GeteduUtilrx {
    public  static int compare(int a ,int b){
        if(a>=b){
                return b ;
            }else{
                return a;
            }
    }
    public static HashMap<String,Integer> getedu (String ty,int a ){
        int min = 0;
        int max = 0;

        if (ty.equals("a") || ty.equals("b")){
            min = compare(a * 268,500000);
            max = compare(a * 403,1000000);
        }

        if (ty.equals("c")) {
            min = compare(a * 268, 300000);
            max = compare(a * 403, 300000);
        }

        if (ty.equals("d")){
            min = compare(a * 202,300000);
            max = compare(a * 313,300000);
        }

        HashMap<String,Integer> map = new HashMap<>();
        map.put("min",min);
        map.put("max",max);

        return map;
    }

}
