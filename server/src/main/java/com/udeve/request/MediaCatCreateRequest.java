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
import java.io.Serializable;

@Data
public class MediaCatCreateRequest implements Serializable {
    @NotBlank(message = "创建的相册名不能为空")
    public String name;
    @NotNull(message = "楼盘id不能为空")
    public Integer targetId;
    @NotBlank(message = "创建相册类型不能为空")
    public String targetType;
}
