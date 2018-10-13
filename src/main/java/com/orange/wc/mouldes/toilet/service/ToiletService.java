package com.orange.wc.mouldes.toilet.service;

import com.orange.wc.Common.ResultData;
import com.orange.wc.mouldes.toilet.vo.ToiletVo;

import java.io.IOException;
import java.util.List;

/**
 * @Title: ToiletService
 * @Prject: wc
 * @Package: com.orange.wc.mouldes.toilet.service
 * @Description:
 * @author: willinggod
 * @date: 2018/9/29 13:57
 * @version: V1.0
 * Copyright  2018 中软华腾. All rights reserved.
 */

public interface ToiletService {

    /**
     * 查询所有的wc蹲位信息
     * @param
     * @return List<ToiletVo>
     * @throws Exception
     * @author willinggod
     */
    List<ToiletVo> queryWCList() throws IOException;
    /**
     * 根据蹲位序号，设置相应的状态
     * @param status 状态
     * @param toiletId 蹲位id
     * @return ResultData
     * @throws Exception
     * @author willinggod
     */
    ResultData changeToiletStatus(String status,String toiletId);


}
