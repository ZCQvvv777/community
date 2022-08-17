package com.ZCQvvv777.community.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

/**
 * @Description TODO
 * @Date 2022/8/15 14:16
 */

@Configuration
public class AlphaConfig {
    @Bean
    public SimpleDateFormat simpleDateFormat() {
        return new SimpleDateFormat(("yyyy-MM-dd HH:mm:ss"));
    }
}
