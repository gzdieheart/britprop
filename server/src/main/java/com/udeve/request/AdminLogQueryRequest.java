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

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Data
public class AdminLogQueryRequest extends CommonRequest{
    public  String dateRange;


    public List<LocalDateTime> getDates(){
        String[] dates = dateRange.split(",");
        List<LocalDateTime> dateList = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        for (String date : dates) {
            LocalDate localDate = LocalDate.parse(date,formatter);
            dateList.add(LocalDateTime.of(localDate, LocalTime.MIDNIGHT));
        }
        return dateList;
    }
}
