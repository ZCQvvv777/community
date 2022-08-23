package com.ZCQvvv777.community.util;

/**
 * @Description 常量接口
 * @Date 2022/8/19 15:14
 */
public interface CommunityConstant {
    /**
     * 激活成功
     */
    int ACTIVATION_SUCCESS = 0;

    /**
     * 重复激活
     */
    int ACTIVATION_REPEAT = 1;

    /**
     * 激活失败
     */
    int ACTIVATION_FAILURE = 2;

    /**
     * 默认状态的登录凭证超时时间
     */
    int DEFAULT_EXPIRED_SECONDS = 3600 * 12;

    /**
     *  记住状态下的登录凭证超时时间
     */
    int REMEMBER__EXPIRED_SECONDS = 3600 * 24 *10;// 10天
}
