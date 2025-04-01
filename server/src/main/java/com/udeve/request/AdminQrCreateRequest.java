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

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
public class AdminQrCreateRequest implements Serializable {

    @NotBlank(message = "标题不能为空")
    @Schema(description = "标题", example = "标题")
    public String title;

    public String data;
    @NotBlank(message = "路径不能为空")
    @Schema(description = "小程序页面路径", example = "/pages/index/index")
    public String path;
}
