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

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
public class AdminWeappConfigRequest implements Serializable {

    @NotBlank(message = "小程序名称不能为空")
    public String xcxName;

    @NotBlank(message = "AppID(小程序ID)不能为空")
    public String xcxAppId;

    @NotBlank(message = "AppSecret(小程序密钥)不能为空")
    public String xcxSecret;

    public String msgTplId;//消息模板id，非必填
}
