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
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class WeappQuestionVo implements Serializable {

    public List<AnswerVo> answer;
    public Integer answersCount = 0;
    public String content;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public LocalDateTime createdAt;
    public AnswerVo firstAnswer;
    public Integer id;
    public Integer likeNums;
    public Integer likeNumsBase;
    @JsonProperty("public")
    public Boolean isPublic;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public LocalDateTime sendMessageAt;
    public Integer targetId;
    public String targetType;
    public String targetName;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public LocalDateTime updatedAt;
    public AdminWeappUserListVo user;
    public Integer userId;
    public Boolean followed;
    public Integer followersCount;
    public Boolean isDone = false;//此问题是否显示

}
