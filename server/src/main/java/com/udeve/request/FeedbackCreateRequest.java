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

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
public class FeedbackCreateRequest implements Serializable {

    public String uid;

    @NotBlank(message = "反馈类型不能为空")
    public String feedbackType;

    @NotBlank(message = "问题描述不能为空")
    public String content;

    public String images;

    public String contact;

}
