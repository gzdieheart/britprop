package com.udeve.entity;
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

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = Role.TABLE_NAME)
public class Role implements Serializable {
    public static final String TABLE_NAME = "roles";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    public String name;

    public Boolean enable;

    public String icon;

    public String color;

    @Column(name = "`key`")
    public String key;

    @Column(nullable = false)
    public LocalDateTime createdAt;

    @Column(nullable = false)
    public LocalDateTime updatedAt;

    @ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinTable(name = "role_permission_items", joinColumns ={@JoinColumn(name = "roleId", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "permissionItemId", referencedColumnName = "id")})
    public List<PermissionItem> permissionItems;


}
