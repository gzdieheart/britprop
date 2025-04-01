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

import java.io.Serializable;

import lombok.Data;


@Data
public class ChatUserInfoForWeappVo implements Serializable {
    public Integer id = 0;
    public String name;
    public String avatar;
    public String mobile;

}
