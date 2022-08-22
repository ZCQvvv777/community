package com.ZCQvvv777.community.config;

import com.google.code.kaptcha.Producer;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * @Description TODO
 * @Date 2022/8/22 10:53
 */


// 验证码
@Configuration
public class KaptchaConfig {

    // 生成验证码
    @Bean
    public Producer kaptchaProducer(){
        // 设置验证码的属性
        Properties properties = new Properties();
        properties.setProperty("kaptcha.image.width", "100");
        properties.setProperty("kaptcha.image.height", "40");
        properties.setProperty("kaptcha.textproducer.font.size", "32");
        properties.setProperty("kaptcha.textproducer.font.color", "0,0,0");
        properties.setProperty("kaptcha.textproducer.char.string", "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        properties.setProperty("kaptcha.textproducer.char.length", "4");
        properties.setProperty("kaptcha.noise.impl", "com.google.code.kaptcha.impl.NoNoise");

        // 创建验证码
        DefaultKaptcha kaptcha = new DefaultKaptcha();
        Config config = new Config(properties); // 传入配置
        kaptcha.setConfig(config);

        // class DefaultKaptcha implements Producer
        return kaptcha;
    }

}