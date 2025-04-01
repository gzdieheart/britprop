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
import java.util.List;

@Data
public class BookingConfigUpdateRequest implements Serializable {

    @NotNull(message = "星期不能为空")
    public Integer week;

    @NotNull(message = "时间不能为空")
    public List<String> hours;

    @NotNull(message = "状态不能为空")
    public Boolean status;

    @NotBlank(message = "备注不能为空")
    public String remark;
}
