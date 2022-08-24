package com.ZCQvvv777.community.util;

import com.ZCQvvv777.community.entity.User;
import org.springframework.stereotype.Component;

/**
 * @Description 持有用户的信息，用于代替session对象（多线程隔离）
 * @Date 2022/8/24 15:53
 */

@Component
public class HostHolder {
    private ThreadLocal<User> users = new ThreadLocal<>();

    public void setUser(User user) {
        users.set(user);
    }

    public User getUser() {
        return users.get();
    }

    public void clear() {
        users.remove();
    }
}
