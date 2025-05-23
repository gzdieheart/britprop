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

import com.udeve.entity.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
    List<Post> findByTitleContainingAndIsPublicTrueAndIsDeleteFalse(String keyword);

    Page<Post> findAll(Specification<Post> specification, Pageable pageable);


    @Query(value = "select * from posts where is_delete = 0 and is_public = 1 and id in ?1",nativeQuery = true)
    List<Post> findByIds(List<Integer> ids,Pageable pageable);

    @Query(value = "select * from posts where is_delete = 0 and is_public = 1 and id in ?1",nativeQuery = true)
    Page<Post> getByIdsAndIsDeleteFalseAndIsPublicTrue(List<Integer> ids,Pageable pageable);

    Integer countByCity_IdAndIsPublicTrueAndIsDeleteFalse(Integer cityId);
    Post findFirstByCity_IdAndIsPublicTrueAndIsDeleteFalse(Integer cityId);

    Integer countByDistrict_IdAndIsPublicTrueAndIsDeleteFalse(Integer districtId);
    Post findFirstByDistrict_IdAndIsPublicTrueAndIsDeleteFalse(Integer districtId);

    List<Post> findTop10ByIdNotInAndIsPublicTrueAndIsDeleteFalseOrderBySearchNumsDesc(List<Integer> ids);
    List<Post> findTop10ByIsPublicTrueAndIsDeleteFalseOrderBySearchNumsDesc();
}
