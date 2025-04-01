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

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class AdminPostTypeListVo {
    public Integer id;

    public String name;

    public Integer s;

    public Integer t;

    public Integer w;

    public String desc;

    public Integer postId;

    public String position;

    public Float area;

    public Integer number;

    public Float totalPrice;

    public Integer averagePrice;

    public Boolean unknowPrice;

    public String tags;

    public LocalDateTime createdAt;

    public LocalDateTime updatedAt;

    public Integer saleStatusItemId;

    public String postTitle;

    public String code;

    public String vr;

    public String mainTag;

    public String images;

    public List<String> imagesList;
}
