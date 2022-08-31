package com.ZCQvvv777.community.dao;

import com.ZCQvvv777.community.entity.LoginTicket;
import org.apache.ibatis.annotations.*;

/**
 * @Description 使用注解的方式完成SQL语句
 * @Date 2022/8/23 21:05
 */
@Mapper
@Deprecated
public interface LoginTicketMapper {

    @Insert({
            "insert into login_ticket(user_id,ticket,status,expired) ",
            "values(#{userId},#{ticket},#{status},#{expired})"
    })
    // 自动生成主键
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertLoginTicket(LoginTicket loginTicket) ;

    @Select({
            "select id, user_id, ticket, status, expired ",
            "from login_ticket where ticket=#{ticket}"
    })
    LoginTicket selectByTicket (String ticket);

    // 演示动态SQL
    @Update({
//            "<script>",
            "update login_ticket set status=#{status} where ticket=#{ticket} ",
//            "<if test=\"ticket!=null\">",
//            "and 1=1 ",
//            "</script>"
    })
    // 退出时 改变状态
    int updateStatus(String ticket, int status);

}
