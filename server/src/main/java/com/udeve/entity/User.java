package com.udeve.entity;
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
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name=User.TABLE_NAME)
@Data
public class User {
    public static final String TABLE_NAME = "users";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column
    public String name;

    @Column(unique = true, nullable = false, length = 11)
    public String mobile;

    @Column
    public String avatar = "https://tcdn.udeve.net/default-avatar.png";

    public LocalDateTime createdAt = LocalDateTime.now();

    public Boolean ban = false;
    public Boolean isOnline = false;

    public String ip;

    public String ipRegion;

    public String uid;

    public String remark;

}
