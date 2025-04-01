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

import com.udeve.entity.New;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewRepository extends JpaRepository<New, Integer> {

    Integer countByNewsCatId(Integer id);

    Page<New> findAll(Specification<New> specification, Pageable pageable);

    List<New> findTop5ByNewsCatIdAndIsPublicTrue(Integer id);

    List<New> findTop5ByIsPublicTrueOrderByCreatedAt();

    List<New> findTop5ByIsPublicTrueAndIsTopTrueOrderByCreatedAt();

    List<New> findByNewsCatIdAndIsPublicTrue(Integer newCatId);
}
