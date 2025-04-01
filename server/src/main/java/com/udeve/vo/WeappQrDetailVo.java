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
import io.swagger.models.auth.In;
import lombok.Data;

import java.io.Serializable;

@Data
public class WeappQrDetailVo implements Serializable {

    public Integer id;
    public String path;
    public String title;
    public JSONObject data;

}
