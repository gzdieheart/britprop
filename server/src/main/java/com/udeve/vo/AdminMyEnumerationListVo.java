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
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class AdminMyEnumerationListVo implements Serializable {

    public Integer id;
    public String name;
    public Integer number;
    public Boolean isDefault;
    public String cat;
    public Boolean active;
    public Integer parentId;
    public String parentName;
    public LocalDateTime createdAt;
    public LocalDateTime updatedAt;
    public String value;
    public Boolean isDelete;

}
