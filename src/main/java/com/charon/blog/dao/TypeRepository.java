package com.charon.blog.dao;

import com.charon.blog.po.Type;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @description:
 * @author: charon
 * @create: 2019-12-24 20:43
 **/
public interface TypeRepository extends JpaRepository<Type,Integer> {

    Type findByName(String name);

    @Query("select t from Type t")
    List<Type> findTop(Pageable pageable);
}
