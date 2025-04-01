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
import cn.hutool.core.util.ObjectUtil;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Data
public class WeappBookingConfigVo implements Serializable {

    public Integer week;

    public List<String> hours;

    public LocalDateTime createdAt;

    public LocalDateTime updatedAt;

    public void setHours(String hours) {
        if (ObjectUtil.isEmpty(hours)){
            return;
        }
        this.hours = Arrays.stream(hours.split(",")).toList();
    }
}
