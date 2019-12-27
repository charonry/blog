package com.charon.blog.service;

import com.charon.blog.po.Comment;

import java.util.List;

/**
 * @description:
 * @author: charon
 * @create: 2019-12-25 22:47
 **/
public interface CommentService {

    List<Comment> listCommentByBlogId(Integer blogId);

    Comment saveComment(Comment comment);
}
