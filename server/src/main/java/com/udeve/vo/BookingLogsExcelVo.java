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
import com.alibaba.excel.annotation.ExcelProperty;
import com.udeve.utils.converter.BookIngLogStatusConverter;
import lombok.Data;

import java.time.LocalDate;

@Data
public class BookingLogsExcelVo {
    @ExcelProperty("#")
    public Integer id;

    @ExcelProperty("楼盘标题")
    public String postTitle;

    @ExcelProperty("客户姓名")
    public String name;

    @ExcelProperty("手机号")
    public String mobile;

    @ExcelProperty("预约日期")
    public LocalDate date;

    @ExcelProperty("预约时间")
    public String time;

    @ExcelProperty(value = "预约状态", converter = BookIngLogStatusConverter.class)
    public Integer status;

    @ExcelProperty("备注")
    public String remark;

}
