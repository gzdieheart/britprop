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

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import com.udeve.entity.BookingLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingLogRepository extends JpaRepository<BookingLog, Integer> {
    Page<BookingLog> findAll(Specification<BookingLog> specification, Pageable pageable);

    List<BookingLog> findByUserIdAndStatus(Integer userId,Integer status);

    BookingLog findByIdAndUserId(Integer bookingId,Integer userId);

}