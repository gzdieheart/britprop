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

import java.time.LocalDateTime;

@Data
public class AdminMediaFileListVo {
    public Integer id = 0;

    public LocalDateTime createdAt;

    public Integer parentId = null;

    public String url;
    public String coverUrl;
    public String filetype = "dir";
    public Integer size = 0;
    public String filename = "我的文件";

    public Boolean isDir = true;
    public Boolean canCreateDir = false;
    public Boolean canDelete = false;
    public Boolean canMove = false;
    public Boolean canRename = false;


}
