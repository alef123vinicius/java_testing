package com.spring.codeblog.service.implementations;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.IPostRepository;
import com.spring.codeblog.service.interfaces.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService implements IPostService {

    @Autowired
    IPostRepository iPostRepository;

    @Override
    public List<Post> findAll() {
        return iPostRepository.findAll();
    }

    @Override
    public Post findByID(long id) {
        return iPostRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return iPostRepository.save(post);
    }
}
