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

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Column;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class NewsListingVo implements Serializable {
    public Integer id;
    public String title;
    public String contentType;
    public String author;
    public String summary;
    public String cover;
    public String avatar;
    public String url;
    public Integer viewNums;
    public Integer likeNums;
    public String source;
    public Boolean isPublic;

    @JsonFormat(pattern="yyyy-MM-dd")
    public LocalDate date;

    public String newsCat;
}
