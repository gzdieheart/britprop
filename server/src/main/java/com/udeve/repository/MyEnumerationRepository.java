package com.udeve.repository;
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

import com.udeve.entity.MyEnumeration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MyEnumerationRepository extends JpaRepository<MyEnumeration, Integer>, JpaSpecificationExecutor<MyEnumeration> {

    List<MyEnumeration> findByCatAndIsDeleteFalseOrderByNumberDesc(String cat);

    MyEnumeration findByCatAndValueAndIsDeleteFalse(String cat, String value);

    List<MyEnumeration> findByIsDeleteFalseOrderByNumberDesc();


}
