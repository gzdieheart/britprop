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

import javax.persistence.Column;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class WeappAlbumDetailVo implements Serializable {

    public Integer id;
    public String name;
    public String key;
    public String cover;
    public String cat;
    public String title;
    public Integer number;
    public LocalDateTime createdAt;
    public LocalDateTime updatedAt;
    public Boolean canDelete;
    public String content;
    public Integer postCount;

}
