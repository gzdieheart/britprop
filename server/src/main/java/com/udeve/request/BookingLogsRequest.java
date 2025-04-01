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
import java.time.LocalDate;

@Data
public class BookingLogsRequest implements Serializable {

    @NotNull(message = "楼盘id不能为空")
    public Integer postId;
    public Integer userId;
    public String remark;
    public Integer status;
    public LocalDate date;
    public String time;
    public String name;
    @NotBlank(message = "手机号不能为空")
    public String mobile;

}
