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
public class FeedbackListVo implements Serializable {
    public Integer id;
    public String uid;
    public String feedbackType;
    public String content;
    public String images;
    public String contact;
    public Boolean isDelete;
    public LocalDateTime createdAt;
    public LocalDateTime updatedAt;
}
