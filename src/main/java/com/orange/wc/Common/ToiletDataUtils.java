package com.orange.wc.Common;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.orange.wc.mouldes.toilet.service.ToiletService;
import com.orange.wc.mouldes.toilet.vo.ToiletVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.util.CollectionUtils;
import sun.misc.IOUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: ToiletDataUtils
 * @Prject: wc
 * @Package: com.orange.wc.Common
 * @Description:
 * @author: willinggod
 * @date: 2018/9/30 10:31
 * @version: V1.0
 * Copyright  2018 中软华腾. All rights reserved.
 */
public class ToiletDataUtils {
    /**
     * 加载初始配置数据
     */
    @Autowired
    private ToiletService toiletService;
    /**
     * 设置全局的静态集合对象，存在当前的数据
     */
    public static List<ToiletVo> toiletVoList=new ArrayList<>();



    /**
     * 获取当前所有数据集合
     * @param
     * @return ResultData
     * @throws Exception
     * @author willinggod
     */
    public static List<ToiletVo> getAllToiletList(){
        return toiletVoList;
    }





    /**
     * 初始化数据方法
     * @param
     * @return ResultData
     * @throws Exception
     * @author willinggod
     */
    public static void initToiletList( List<ToiletVo>  toiletVos){
        toiletVoList=toiletVos;
    }


}
