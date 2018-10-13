package com.orange.wc.mouldes.toilet.service.impl;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.orange.wc.Common.ResultData;
import com.orange.wc.Common.ToiletDataUtils;
import com.orange.wc.mouldes.toilet.service.ToiletService;
import com.orange.wc.mouldes.toilet.vo.ToiletVo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import sun.misc.IOUtils;

import javax.annotation.PostConstruct;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.IOException;
import java.util.List;

/**
 * @Title: ToiletServiceImpl
 * @Prject: wc
 * @Package: com.orange.wc.mouldes.toilet.service.impl
 * @Description:
 * @author: willinggod
 * @date: 2018/9/29 13:59
 * @version: V1.0
 * Copyright  2018 中软华腾. All rights reserved.
 */
@Service("toiletService")
public class ToiletServiceImpl implements ToiletService {
    /**
     * 加载初始配置数据
     */
    @Value("classpath:/static/data/toiletData.json")
    private Resource toiletData;
    /**
     * 查询所有的wc蹲位信息
     * @param
     * @return toiletVoList
     * @throws Exception
     * @author willinggod
     */
    /**初始化缓存数据 */
    @PostConstruct
    @Override
    public List<ToiletVo> queryWCList() throws IOException {
        ResultData resultData=new ResultData();
        Gson gson=new Gson();
        String json = new String(IOUtils.readFully(toiletData.getInputStream(), -1,true));
        List<ToiletVo> toiletVoList=gson.fromJson(json,new TypeToken<List<ToiletVo>>() {
        }.getType());
        //调用静态方法初始化变量
        ToiletDataUtils.initToiletList(toiletVoList);
        return toiletVoList;
    }





    /**
     * 根据蹲位序号，设置相应的状态
     * @param status 状态
     * @param toiletId 蹲位id
     * @return ResultData
     * @throws Exception
     * @author willinggod
     */
    @Override
    public ResultData changeToiletStatus(@Valid @NotNull(message ="状态不能为空")String status,@Valid  @NotNull(message ="id不能为空")String toiletId){
        //首先从全局对象中获取集合
        List<ToiletVo> toiletVoList=ToiletDataUtils.getAllToiletList();
        if(!CollectionUtils.isEmpty(toiletVoList)){
            //设置变更记录变量
            boolean isUpdate=false;
            for(ToiletVo toiletVo:toiletVoList){
                if(toiletId.equals(toiletVo.getId())){
                    toiletVo.setStatus(status);
                    isUpdate=true;
                    break;
                }
            }
            if(isUpdate){
                return ResultData.ok("状态修改成功");
            }else{
                return ResultData.error("找不到对应记录");
            }
        }else{
            return ResultData.error("找不到对应记录");
        }
    }

}
