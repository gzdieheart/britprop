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

@Data
@Entity
@Table(name = Fav.TABLE_NAME)
public class Fav {
    public static final String TABLE_NAME = "favs";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    //public Integer postId;

    @Column(nullable = false)
    public Integer userId;

    //public Integer status;

    public LocalDateTime updatedAt;


    @Column(nullable = false)
    public String targetType;

    @Column(nullable = false)
    public Integer targetId;

}
