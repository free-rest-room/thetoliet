package com.orange.wc.mouldes.location.vo;

import java.io.Serializable;

/**
 * @Title: LocationVo
 * @Prject: wc
 * @Package: com.orange.wc.mouldes.location.vo
 * @Description:
 * @author: willinggod
 * @date: 2018/9/30 8:56
 * @version: V1.0
 * Copyright  2018 中软华腾. All rights reserved.
 */
public class LocationVo implements Serializable{
    public static final Long serialVersionUID=1L;
    /**
     * 经度
     */
    private String lon;
    /**
     * 纬度
     */
    private String lat;
    /**
     * 高程
     */
    private String alt;
    /**
     * 所在位置详细信息
     */
    private String detailLocation;
    /**
     * 所在省代码
     */
    private String provinceCode;
    /**
     * 所在市代码
     */
    private String cityCode;
    /**
     * 所在县代码
     */
    private String townCode;

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getDetailLocation() {
        return detailLocation;
    }

    public void setDetailLocation(String detailLocation) {
        this.detailLocation = detailLocation;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getTownCode() {
        return townCode;
    }

    public void setTownCode(String townCode) {
        this.townCode = townCode;
    }
}
