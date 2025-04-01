package com.udeve.vo;
/**
 * +----------------------------------------------------------------------
 * | 友得云客
 * +----------------------------------------------------------------------
 * | Copyright (c) 2024~2027
 * +----------------------------------------------------------------------
 * | Licensed 友得云客不是自有软件 未经允许不可移除相关版权
 * +----------------------------------------------------------------------
 * | Author: www.youdeyunke.com
 * +----------------------------------------------------------------------
 */

import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import com.udeve.entity.Fitment;
import com.udeve.entity.SaleStatusItem;
import com.udeve.entity.TagEntity;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class AdminPostListVo implements Serializable {
    public JSONObject areaInfo;
    public JSONObject averagePriceInfo;
    public JSONObject totalPriceInfo;
    public Integer id;
    public String title;

    public SaleStatusItem saleStatusItem;
    public Integer likeNums;
    public Integer customerNums;
    public Boolean isTop;
    public Boolean isPublic;
    public Boolean unknowArea;
    public Boolean unknowPrice;
    public Boolean unknowTotalPrice;
    public Float averagePrice;
    public Float averagePriceMax;
    public Float totalPriceMin;
    public Float totalPriceMax;

    public LocalDateTime updatedAt;
    public List<TagEntity> tags;
    public Fitment fitment;
    public LocalDateTime createdAt;

    public Integer detailContentId;
    public List<CatListVo> cats;
    public AdminCityListVo city;
    public AdminDistrictListVo district;
    public String cover;
    public String phone;
    public String subPhone;
    public String qr;
    public Boolean reviewEnable;
    public String url;
    public String bookingsUrl;
}
