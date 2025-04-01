package com.udeve.config;
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
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig {
    /**
     * 创建并配置BCryptPasswordEncoder实例，将其作为Bean注入到应用容器中。
     * @return PasswordEncoder 返回一个配置好的BCryptPasswordEncoder实例，
     *         用于加密和验证用户密码。
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


    /**
     * 配置并返回一个BCryptPasswordEncoder实例。
     * @return BCryptPasswordEncoder 返回一个BCryptPasswordEncoder的实例，
     *         可以用于加密和验证密码。
     */
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
