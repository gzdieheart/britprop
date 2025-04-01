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
public class AdminDistrictCreateRequest implements Serializable {

    @NotBlank(message = "区域名称不能为空")
    @Schema(description = "区域名称", example = "未央区")
    public String name;
    @NotNull(message = "城市id不能为空")
    @Schema(description = "区域所属城市id", example = "1")
    public Integer cityId;

}
