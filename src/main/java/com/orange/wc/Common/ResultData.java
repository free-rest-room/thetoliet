package com.orange.wc.Common;

import java.util.HashMap;

/**
 * @Title: ResultData
 * @Prject: wc
 * @Package: com.orange.wc.Common
 * @Description: 自定义返回类型
 * @author: willinggod
 * @date: 2018/9/29 11:21
 * @version: V1.0
 * Copyright  2018 中软华腾. All rights reserved.
 */
public class ResultData extends HashMap<String, Object>{

    public ResultData(){
        put("code",0);
        put("message", "success");
    }


    public static ResultData ok(String msg) {
        ResultData r = new ResultData();
        r.put("message", msg);
        return r;
    }

    public static ResultData error(String msg) {
        ResultData r = new ResultData();
        r.put("message", msg);
        r.put("code",1);
        return r;
    }
}
