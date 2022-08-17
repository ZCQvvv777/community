package com.ZCQvvv777.community.dao;

import com.ZCQvvv777.community.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description TODO
 * @Date 2022/8/16 10:42
 */

@Mapper
public interface UserMapper {

    User selectById(@Param("id") int id);

    User selectByName(@Param("username") String username);

    User selectByEmail(@Param("email") String email);

    // 返回插入数据的行数
    int insertUser(User user);

    // 返回修改的数据条数 修改状态码
    int updateStatus(@Param("id") int id, @Param("status") int status);

    //更新头像
    int updateHeader(@Param("id") int id, @Param("headerUrl") String headerUrl);

    int updatePassword(@Param("id") int id, @Param("password") String password);


}
