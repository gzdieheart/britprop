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
import com.udeve.entity.BookingConfig;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminBookingConfigRepository extends JpaRepository<BookingConfig, Integer> {

    List<BookingConfig> findByPostId(Integer postId);

    List<BookingConfig> findByPostIdAndStatusTrue(Integer postId);

    Page<BookingConfig> findAll(Specification<BookingConfig> specification, Pageable pageable);


    void deleteByPostId(Integer postId);
}
