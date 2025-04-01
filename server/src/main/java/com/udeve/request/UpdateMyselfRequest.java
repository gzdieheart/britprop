package com.udeve.request;
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
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;

@Data
public class UpdateMyselfRequest implements Serializable {

    @Length(min=1, max = 20, message = "昵称长度为1~20个字符")
    public String name;

    public String avatar;

    public String desc;

    public String wechat;

    public String wechatQr;
}
