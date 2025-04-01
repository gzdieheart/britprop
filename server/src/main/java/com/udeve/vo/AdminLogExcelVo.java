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
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AdminLogExcelVo {
    @ExcelProperty("管理员Id")
    public Integer adminUserId;

    @ExcelProperty("管理员账号")
    public String admin;

    @ExcelProperty("操作类型")
    public String operationType;

    @ExcelProperty("操作内容")
    public String operation;

    @ExcelProperty("创建时间")
    public LocalDateTime createdAt;

    @ExcelProperty("修改时间")
    public LocalDateTime updatedAt;

    @ExcelProperty("IP地址")
    public String ip;

    @ExcelProperty("IP归属地")
    public String ipRegion;
}
