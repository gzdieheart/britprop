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
public class UserProfileExcelVo {

    @ExcelProperty("#")
    public Integer id;

    @ExcelProperty("账号(手机号)")
    public String mobile;

    @ExcelProperty("注册时间")
    public LocalDateTime createdAt;

    @ExcelProperty("IP")
    public String ip;

    @ExcelProperty("IP归属地")
    public String ipRegion;

}
