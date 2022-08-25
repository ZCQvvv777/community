package com.ZCQvvv777.community.controller;

import com.ZCQvvv777.community.entity.DiscussPost;
import com.ZCQvvv777.community.entity.User;
import com.ZCQvvv777.community.service.DiscussPostService;
import com.ZCQvvv777.community.util.CommunityUtil;
import com.ZCQvvv777.community.util.HostHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @Description TODO
 * @Date 2022/8/25 20:49
 */

@Controller
@RequestMapping("/discuss")
public class DiscussPostController {
    @Autowired
    private DiscussPostService discussPostService;
    @Autowired
    private HostHolder hostHolder;

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String addDiscussPost(String title, String content) {
        User user = hostHolder.getUser();
        if (user == null) {
            return CommunityUtil.getJSONString(403, "你还没有登录哦!");
        }

        DiscussPost post = new DiscussPost();
        post.setUserId(user.getId());
        post.setTitle(title);
        post.setContent(content);
        post.setCreateTime(new Date());
        discussPostService.addDiscussPost(post);


        // 报错将来处理
        return CommunityUtil.getJSONString(0, "发布成功！");
    }

}
