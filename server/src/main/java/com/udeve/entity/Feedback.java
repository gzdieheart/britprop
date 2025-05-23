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
@Entity(name = Feedback.TABLE_NAME)
public class Feedback {
    public static final String TABLE_NAME = "feedback";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column(name = "uid")
    public String uid;

    @Column(name = "feedback_type",nullable = false)
    public String feedbackType;

    @Column(name = "content",nullable = false)
    public String content;

    @Column(name = "images")
    public String images;

    @Column(name = "contact")
    public String contact;

    @Column(name = "is_delete")
    public Boolean isDelete = false;

    @Column(nullable = false)
    public LocalDateTime createdAt;

    @Column(nullable = false)
    public LocalDateTime updatedAt;
}
