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
public class WeappNeedCreateRequest implements Serializable {

    @NotBlank(message = "area不能为空")
    public String area;
    @NotNull(message = "budgetMax不能为空")
    public Integer budgetMax;
    @NotNull(message = "budgetMin不能为空")
    public Integer budgetMin;
    public String content;
    @NotBlank(message = "housetype不能为空")
    public String housetype;
    @NotBlank(message = "name不能为空")
    public String name;
    @NotBlank(message = "mobile不能为空")
    public String mobile;
    public String points;
    public String position;
    public Boolean sex;
    public Integer cityId;
    public Integer districtId;

}
