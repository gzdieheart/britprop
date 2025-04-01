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
public class CreateEventsRequest implements Serializable {
    @NotBlank(message = "发布作者不能为空")
    public String author;
    @NotNull(message = "动态分类id不能为空")
    public Integer catId;
    public String content;
    public String images;
    public String pubTime;
    public Boolean pushEnable = false;
    @NotBlank(message = "标题不能为空")
    public String title;
    public Boolean isPublic = false;
}
