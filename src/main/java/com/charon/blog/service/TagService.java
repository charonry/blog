package com.charon.blog.service;

import com.charon.blog.po.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @description:
 * @author: charon
 * @create: 2019-12-24 21:48
 **/
public interface TagService {
    Tag saveTag(Tag tag);

    Tag getTag(Integer id);

    Tag getTagByName(String name);

    Page<Tag> listTag(Pageable pageable);

    List<Tag> listTag();

    List<Tag> listTag(String ids);

    List<Tag> listTagTop(Integer size);

    Tag updateTag(Integer id, Tag tag);

    void deleteTag(Integer id);
}
