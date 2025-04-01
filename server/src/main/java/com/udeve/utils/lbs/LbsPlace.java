package com.udeve.utils.lbs;
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

import java.io.Serializable;

@Data
public class LbsPlace implements Serializable {

    public String id;
    public String title;
    public String address;
    public String category;
    public Integer type;
    public Integer adcode;

    public String province;
    public String city;
    public String district;
    public LbsLocation location;

}
