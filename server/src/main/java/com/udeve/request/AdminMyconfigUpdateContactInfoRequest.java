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

import java.io.Serializable;

@Data
public class AdminMyconfigUpdateContactInfoRequest implements Serializable {
    public String companyName;
    public String serviceMobile;
    public String serviceWechat;
    public String serviceWechatQr;
    public String aboutUs;
    public String statement;
}
