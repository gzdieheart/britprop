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

import lombok.Data;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class AdminWeappUserListVo implements Serializable {

    public Integer id;

    public String name;

    public String mobile;

    public String avatar = "https://tcdn.udeve.net/default-avatar.png";

    public LocalDateTime createdAt = LocalDateTime.now();

    public Boolean ban = false;

    public Boolean isOnline = false;

    public String ip;

    public String ipRegion;

    public String uid;

    public Boolean isBroker = false;

    public Integer level = 0;

    public String remark;


}
