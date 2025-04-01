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
public class AdminVideoCreateRequest implements Serializable {

    @NotBlank(message = "视频标题不能为空")
    public String title;

    public String url;

    public Boolean isWxvideo;

    public String wxauthorId;

    public String authorName;

    public String wxvideoId;

    public String authorAvatar;

    public Boolean isPublic;

    public Integer viewNums;

    @NotBlank(message = "视频封面不能为空")
    public String cover;
}