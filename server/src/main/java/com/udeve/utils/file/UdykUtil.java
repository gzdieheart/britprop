package com.udeve.utils.file;
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

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "udyk")
public class UdykUtil {

    public static String uploadDir;

    public static String filestorePath;

    public static String getUploadDir() {
        return uploadDir;
    }

    public void setUploadDir(String uploadDir) {
        UdykUtil.uploadDir = uploadDir;
    }

    public static String getFilestorePath() {
        return filestorePath;
    }

    public void setFilestorePath(String filestorePath) {
        UdykUtil.filestorePath = filestorePath;
    }
}
