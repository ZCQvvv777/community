package com.ZCQvvv777.community.config;

import com.ZCQvvv777.community.controller.interceptor.AlphaInterceptor;
import com.ZCQvvv777.community.controller.interceptor.LoginRequiredInterceptor;
import com.ZCQvvv777.community.controller.interceptor.LoginTicketInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description 拦截器配置
 * @Date 2022/8/24 10:20
 */

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Autowired
    private AlphaInterceptor alphaInterceptor;
    @Autowired
    private LoginTicketInterceptor loginTicketInterceptor;

    // 登录状态检查
    @Autowired
    private LoginRequiredInterceptor loginRequiredInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(alphaInterceptor)
                .excludePathPatterns("/**/*.css", "/**/*.png", "/**/*.js", "/**/*.jpg", "/**/*.jpeg")// 排除静态资源
                .addPathPatterns("/register", "/login");

        registry.addInterceptor(loginTicketInterceptor)
                .excludePathPatterns("/**/*.css", "/**/*.png", "/**/*.js", "/**/*.jpg", "/**/*.jpeg");// 排除静态资源

        registry.addInterceptor(loginRequiredInterceptor)
                .excludePathPatterns("/**/*.css", "/**/*.png", "/**/*.js", "/**/*.jpg", "/**/*.jpeg");// 排除静态资源


    }
}
