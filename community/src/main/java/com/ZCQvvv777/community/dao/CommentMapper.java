package com.ZCQvvv777.community.dao;

import com.ZCQvvv777.community.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description TODO
 * @Date 2022/8/29 10:57
 */
@Mapper
public interface CommentMapper {
    List<Comment> selectCommentsByEntity(int entityType, int entityId, int offset, int limit);// 根据实体查询评论

    int selectCountByEntity (int entityType, int entityId);

    // 增加评论
    int insertComment(Comment comment);
}
