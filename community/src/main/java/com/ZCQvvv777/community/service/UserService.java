package com.ZCQvvv777.community.service;

import com.ZCQvvv777.community.dao.UserMapper;
import com.ZCQvvv777.community.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Date 2022/8/16 16:14
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User findUserById(int id) {
        return userMapper.selectById(id);
    }
}
