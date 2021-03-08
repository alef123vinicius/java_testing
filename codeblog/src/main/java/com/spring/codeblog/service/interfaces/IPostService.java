package com.spring.codeblog.service.interfaces;

import com.spring.codeblog.model.Post;

import java.util.List;

public interface IPostService {

    List<Post> findAll();
    Post findByID(long id);
    Post save(Post post);
}
