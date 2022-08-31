package com.ZCQvvv777.community.util;

/**
 * @Description TODO
 * @Date 2022/8/30 20:19
 */

public class RedisKeyUtil {

    private static final String SPLIT = ":";
    private static final String PREFIX_ENTITY_LIKE = "like:entity";

    private static final String PREFIX_KAPTCHA = "kaptcha";
    private static final String PREFIX_TICKET = "ticket";
    private static final String PREFIX_USESR = "user";

    // 某个实体的赞
    // like:entity:entityType:entityId-> set(userId)
    public static String getEntityLikeKey(int entityType, int entityId) {
        return PREFIX_ENTITY_LIKE + SPLIT + entityType + SPLIT + entityId;
    }

    // 登录验证码
    public static String getKaptchaKey (String owner) {
        return PREFIX_KAPTCHA + SPLIT + owner;

    }

    // 登录的凭证
    public static String getTicketKey(String ticket) {
        return PREFIX_TICKET + SPLIT + ticket;
    }

    // 用户
    public static String getUserKey(int userId) {
        return PREFIX_USESR + SPLIT + userId;
    }
}
