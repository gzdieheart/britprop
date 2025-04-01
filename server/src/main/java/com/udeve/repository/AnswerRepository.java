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

import com.udeve.entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Integer>{
    Integer countByQuestionIdAndIsDeleteFalse(Integer questionId);

    List<Answer> findByQuestionIdAndIsDeleteFalse(Integer questionId);

    List<Answer> findByQuestionIdAndIsDeleteFalseAndIsPublicTrue(Integer questionId);

    void deleteByQuestionId(Integer questionId);

    Integer countByUserIdAndIsDeleteFalse(Integer userId);

    @Modifying
    @Query(value = "UPDATE answers SET is_delete = 1 where user_id=?1 and question_id=?2",nativeQuery = true)
    int updateAnswerIsDelete(Integer userId,Integer questionId);
}
