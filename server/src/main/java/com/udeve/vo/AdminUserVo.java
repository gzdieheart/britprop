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
import com.udeve.entity.Role;

import java.time.LocalDateTime;
import java.util.Set;

@Data
public class AdminUserVo {
    public Integer id;
    public String email;
    public String name;
    public String mobile;

    public String currentSignInIp;

    public LocalDateTime currentSignInAt;
    public String avatar;
    public Boolean isForever;

    public LocalDateTime expiredAt;
    public Set<Role> roles;

    public String apiKey;
}
