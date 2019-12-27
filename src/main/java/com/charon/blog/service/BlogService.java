package com.charon.blog.service;

import com.charon.blog.po.Blog;
import com.charon.blog.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: charon
 * @create: 2019-12-24 22:16
 **/
public interface BlogService {

    Blog getBlog(Integer id);

    Blog saveBlog(Blog blog);

    Blog updateBlog(Integer id,Blog blog);

    void deleteBlog(Integer id);

    Page<Blog> listBlog(Pageable pageable);

    Page<Blog> listBlog(String query,Pageable pageable);

    Page<Blog> listBlog(Integer tagId,Pageable pageable);

    Page<Blog> listBlog(Pageable pageable, BlogQuery blog);

    List<Blog> listRecommendBlogTop(Integer size);

    Blog getAndConvert(Integer id);

    Map<String,List<Blog>> archiveBlog();

    Long countBlog();
}
