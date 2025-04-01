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

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Data
public class AdminCityListVo implements Serializable {
    @Schema(description = "城市id", example = "1")
    public Integer id;

    @Schema(description = "城市名称", example = "北京")
    public String name;

    @Schema(description = "城市是否启用", example = "true")
    public Boolean isPublic;

    @Schema(description = "adcode", example = "110000")
    public Integer adcode;

    @Schema(description = "城市是否为默认城市", example = "1")
    public Integer defaultValue;

    public Integer homePageId;
}
