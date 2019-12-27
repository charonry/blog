package com.charon.blog.service;

import com.charon.blog.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @description:
 * @author: charon
 * @create: 2019-12-24 14:36
 **/
public interface TypeService {
    Type saveType(Type type);

    Type getType(Integer id);

    Page<Type> listType(Pageable pageable);

    List<Type> listType();

    List<Type> listTypeTop(Integer size);

    Type updateType(Integer id,Type type);

    void deleteType(Integer id);

    Type getTypeByName(String name);
}
