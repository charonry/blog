package com.charon.blog.dao;

import com.charon.blog.po.Comment;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @description:
 * @author: charon
 * @create: 2019-12-25 22:49
 **/
public interface CommentRepository extends JpaRepository<Comment,Integer> {

    List<Comment> findByBlogIdAndParentCommentNull(Integer blogId, Sort sort);
}
