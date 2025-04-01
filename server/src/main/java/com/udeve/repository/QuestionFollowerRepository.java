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
import com.udeve.entity.QuestionFollower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionFollowerRepository extends JpaRepository<QuestionFollower, Integer> {

    Boolean existsByUserIdAndQuestionId(Integer userId, Integer questionId);

    Integer countByQuestionId(Integer questionId);

    void deleteByQuestionIdAndUserId(Integer questionId, Integer userId);
}
