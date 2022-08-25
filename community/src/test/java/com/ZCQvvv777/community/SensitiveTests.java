package com.ZCQvvv777.community;

import com.ZCQvvv777.community.util.SensitiveFilter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description TODO
 * @Date 2022/8/25 16:34
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class SensitiveTests {
    @Autowired
    private SensitiveFilter sensitiveFilter;

    @Test
    public void testSensitiveFilter () {
        String text = "这里可以赌☆博☆，可以☆开☆票☆，哈哈哈！";
        text = sensitiveFilter.filter(text);
        System.out.println(text);
    }
}
