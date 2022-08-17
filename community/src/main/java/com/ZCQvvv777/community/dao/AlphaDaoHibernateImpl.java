package com.ZCQvvv777.community.dao;

import org.springframework.stereotype.Repository;

/**
 * @Description TODO
 * @Date 2022/8/14 22:18
 */
@Repository("alphaHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao{
    @Override
    public String select() {
        return "Hibernate";
    }
}
