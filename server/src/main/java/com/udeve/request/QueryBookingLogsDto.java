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

@Data
public class QueryBookingLogsDto {
    public String order;

    public String dateRange;

    public Integer postId;

    public String scope;

    public Integer status;

    public Integer page;

    public Integer perPage;

    public String kw;

    public String uid;


    public Integer getPage(){
        return this.page == null ? 1 : this.page;
    }

    public Integer getPerPage() {
        return this.perPage == null ? 10 : this.perPage;
    }
}
