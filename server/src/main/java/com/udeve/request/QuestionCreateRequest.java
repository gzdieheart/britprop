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
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class QuestionCreateRequest implements Serializable {
    @NotBlank(message = "问题内容不能为空")
    public String content;
    @NotNull(message = "楼盘id不能为空")
    public Integer targetId;
    @NotBlank(message = "楼盘类型不能为空")
    public String targetType;
}
