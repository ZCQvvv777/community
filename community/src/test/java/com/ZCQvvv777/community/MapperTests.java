package com.ZCQvvv777.community;

import com.ZCQvvv777.community.dao.DiscussPostMapper;
import com.ZCQvvv777.community.dao.UserMapper;
import com.ZCQvvv777.community.entity.DiscussPost;
import com.ZCQvvv777.community.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

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

}
