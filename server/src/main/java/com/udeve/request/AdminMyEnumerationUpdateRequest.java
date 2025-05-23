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
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class AdminMyEnumerationUpdateRequest implements Serializable {
    @NotBlank(message = "name不能为空")
    @Schema(description = "名称", example = "名称")
    public String name;
    @DecimalMin(value = "0",message = "number不能小于0")
    @Schema(description = "排序", example = "1")
    public Integer number;

    @NotBlank(message = "cat不能为空")
    @Schema(description = "分类", example = "分类")
    public String cat;
    @NotNull(message = "active不能为空")
    @Schema(description = "是否启用", example = "true")
    public Boolean active;

    @NotBlank(message = "value不能为空")
    @Schema(description = "值", example = "值")
    public String value;

}
