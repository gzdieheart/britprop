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

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
public class AdminMediaItemUpdateRequest implements Serializable {


    @NotBlank(message = "url不能为空")
    @Schema(description = "文件url", example = "https://www.baidu.com/1.jpg")
    public String url;
    @NotBlank(message = "filetype不能为空")
    @Schema(description = "文件类型", example = "image")
    public String filetype;


}
