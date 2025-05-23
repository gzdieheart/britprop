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

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class AdminFirstScreenAddCreateRequest implements Serializable {

    @NotBlank(message = "名称不能为空")
    @Schema(description = "名称", example = "名称")
    public String name;
    @NotBlank(message = "图片不能为空")
    @Schema(description = "图片", example = "https://www.baidu.com/img/bd_logo1.png")
    public String image;

    @JsonProperty("public")
    @NotNull(message = "是否投放不能为空")
    @Schema(description = "是否投放", example = "true")
    public Boolean publicValue;

    @NotNull(message = "时长不能为空")
    @DecimalMin(value = "0",message = "时长不能小于0")
    @Schema(description = "时长", example = "5")
    public Integer time;
    @Schema(description = "跳转链接", example = "跳转链接")
    public String link;
}
