package com.ZCQvvv777.community;

import com.ZCQvvv777.community.dao.DiscussPostMapper;
import com.ZCQvvv777.community.dao.LoginTicketMapper;
import com.ZCQvvv777.community.dao.UserMapper;
import com.ZCQvvv777.community.entity.DiscussPost;
import com.ZCQvvv777.community.entity.LoginTicket;
import com.ZCQvvv777.community.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

/**
 * @Description TODO
 * @Date 2022/8/16 11:03
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
//locations = {"classpath:applicationContext.xml", "classpath:spring-servlet.xml"}
//locations = {"classpath:*/discusspost-mapper.xml", "classpath:*/user-mapper.xml"}
//classes = CommunityApplication.class
public class MapperTests {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private DiscussPostMapper discussPostMapper;
    @Autowired
    private LoginTicketMapper loginTicketMapper;

    @Test
    public void testSelectUser() {
        User user = userMapper.selectById(101);
        System.out.println(user);

        User user1 = userMapper.selectByName("liubei");
        System.out.println(user1);
    }

    @Test
    public void testSelectPosts() {
        List<DiscussPost> list = discussPostMapper.selectDiscussPosts(0, 0, 10);
        for (DiscussPost discussPost : list) {
            System.out.println(discussPost);
        }
        int rows = discussPostMapper.selectDiscussPostRows(149);
        System.out.println(rows);
    }

    @Test
    public void testInsertLoginTicket () {
        LoginTicket loginTicket = new LoginTicket();
        loginTicket.setUserId(101);
        loginTicket.setTickets("abd");
        loginTicket.setStatus(0);
        loginTicket.setExpired(new Date(System.currentTimeMillis() + 1000 * 60 * 10));// 10min
        loginTicketMapper.insertLoginTicket(loginTicket);
    }
    @Test
    public void testSelectLoginTicket(){
        LoginTicket loginTicket = loginTicketMapper.selectByTicket("abd");
        System.out.println(loginTicket);

        loginTicketMapper.updateStatus("abd", 1);
        loginTicket = loginTicketMapper.selectByTicket("abd");
        System.out.println(loginTicket);

    }
}
