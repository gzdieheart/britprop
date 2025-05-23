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

// 用于小程序端楼盘详情页中各模块的显示数据结构

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Data
@Slf4j
public class PostBlockVo implements Serializable {
    public String label;
    public String labelShort;
    public String name;
    public JSONObject value;

    @JsonIgnoreProperties
    private Boolean show = true;
}
