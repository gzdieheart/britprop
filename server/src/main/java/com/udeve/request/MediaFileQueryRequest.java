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

import java.io.Serializable;

@Data
public class MediaFileQueryRequest implements Serializable {

    public String filetype;
    public Integer parentId;
    public Integer page;
    public Integer pageSize;

    public Integer getPage(){
        return this.page == null ? 1 : this.page;
    }
    public Integer getPageSize(){
        return this.pageSize == null ? 10: this.pageSize;
    }

}
