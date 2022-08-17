package com.ZCQvvv777.community.service;

import com.ZCQvvv777.community.dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Description TODO
 * @Date 2022/8/15 10:31
 */
@Service
//@Scope("prototype")
public class AlphaService {
    @Autowired//自动注入AlphaDao
    private AlphaDao alphaDao;

    public AlphaService() {
        System.out.println("实例化Alpha");
    }

    @PostConstruct//构造后调用
    public void init(){
        System.out.println("初始化AlphaService");
    }
    @PreDestroy// 销毁前调用
    public void PreDestroy() {
        System.out.println("销毁Alpha");
    }

    public String find() {
        return alphaDao.select();
    }
}
