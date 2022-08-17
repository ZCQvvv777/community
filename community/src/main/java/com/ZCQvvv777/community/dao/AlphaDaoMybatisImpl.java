package com.ZCQvvv777.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * @Description TODO
 * @Date 2022/8/14 22:20
 */
@Repository
@Primary
public class AlphaDaoMybatisImpl implements AlphaDao{

    @Override
    public String select() {
        return "MyBatis";
    }
}
