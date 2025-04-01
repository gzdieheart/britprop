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

@Data
@Entity
@Table(name = City.TABLE_NAME)
public class City {
    public static final String TABLE_NAME = "cities";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    public String name;

    public Boolean isPublic;

    public Integer adcode;

    @Column(name = "`default`")
    public Boolean defaultValue = false;

    public Integer homePageId;

    public City(String name, Boolean isPublic, Integer adcode, Integer homePageId){
        this.name = name;
        this.isPublic = isPublic;
        this.adcode = adcode;
        this.homePageId = homePageId;
    }

    public City() {

    }
}
