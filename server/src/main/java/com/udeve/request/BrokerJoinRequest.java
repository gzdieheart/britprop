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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
public class BrokerJoinRequest implements Serializable {

    @NotBlank(message = "姓名不能为空")
    public String name;

    public Integer sex = 0;

    @NotBlank(message = "手机号不能为空")
    @Size(min = 11, max = 11, message = "手机号长度必须为11")
    public String mobile;

    public String avatar;

    @NotNull(message = "楼盘id不能为空")
    public Integer postId;

    public String wechat;

}
