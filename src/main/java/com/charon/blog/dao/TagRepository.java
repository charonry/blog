package com.charon.blog.dao;

import com.charon.blog.po.Tag;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @description:
 * @author: charon
 * @create: 2019-12-24 21:50
 **/
public interface TagRepository extends JpaRepository<Tag,Integer> {

    Tag findByName(String name);

    @Query("select t from Tag t")
    List<Tag> findTop(Pageable pageable);
}
