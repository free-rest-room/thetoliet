package com.orange.wc.mouldes.toilet.vo;

import com.orange.wc.mouldes.location.vo.LocationVo;

import java.io.Serializable;

/**
 * @Title: ToiletVo
 * @Prject: wc
 * @Package: com.orange.wc.mouldes.toilet.vo
 * @Description:
 * @author: willinggod
 * @date: 2018/9/30 8:53
 * @version: V1.0
 * Copyright  2018 中软华腾. All rights reserved.
 */
public class ToiletVo implements Serializable{
    public static final Long serialVersionUID=1L;
    /**
     * 序号
     */
    private String id;
    /**
     * 序号
     */
    private String name;
    /**
     * 性别
     */
    private String sex;
    /**
     * 状态
     */
    private String status;
    /**
     * 坐标信息
     */
    private LocationVo position;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocationVo getPosition() {
        return position;
    }

    public void setPosition(LocationVo position) {
        this.position = position;
    }
}
