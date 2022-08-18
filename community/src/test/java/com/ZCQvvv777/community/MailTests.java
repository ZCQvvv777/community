package com.ZCQvvv777.community;

import com.ZCQvvv777.community.util.MailClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

/**
 * @Description 编写测试类MailTests，测试发送普通邮件及HTML邮件。
 * @Date 2022/8/18 10:51
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MailTests {
    @Autowired
    private MailClient mailClient;

    @Autowired
    private TemplateEngine templateEngine;

    @Test
    public void testTextMail() {
        mailClient.sendMail("ZCQvvv777@buaa.edu.cn", "TEST","Hello!");
    }
    @Test
    public void testHtmlMail(){
        Context context = new Context();
        context.setVariable("username","Sunday");

        String content = templateEngine.process("/mail/demo", context);
        System.out.println(content);

        mailClient.sendMail("ZCQvvv777@buaa.edu.cn","HTML", content);
    }
}
