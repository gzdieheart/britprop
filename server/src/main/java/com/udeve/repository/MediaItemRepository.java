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

import com.udeve.entity.MediaItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MediaItemRepository extends JpaRepository<MediaItem, Integer> {

    List<MediaItem> findByMediaCatIdOrderByNumberAsc(Integer mediaCatId);

    Integer countByMediaCatId(Integer mediaCatId);

    void deleteByMediaCatId(Integer mediaCatId);

    MediaItem findFirstByMediaCatIdAndFiletypeOrderByNumberAsc(Integer catId, String filetype);
}
