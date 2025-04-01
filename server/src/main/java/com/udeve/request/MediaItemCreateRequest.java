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
public class MediaItemCreateRequest implements Serializable {
    @NotNull(message = "所属相册id不能为空")
    public Integer mediaCatId;
    @NotBlank(message = "照片类型不能为空")
    public String filetype;
    @NotBlank(message = "url不能为空")
    public String url;
}
