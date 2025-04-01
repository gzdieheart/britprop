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
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class AdminCityCreateRequest implements Serializable {


    @NotBlank(message = "城市名称不能为空")
    @Schema(description = "城市名称", example = "北京")
    public String name;
    @NotNull(message = "是否公开不能为空")
    @Schema(description = "是否公开", example = "true")
    public Boolean isPublic;
    @NotNull(message = "adcode不能为空")
    @Schema(description = "adcode", example = "110000")
    public Integer adcode;

    public Integer homePageId;

}
