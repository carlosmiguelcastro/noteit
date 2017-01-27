package com.castro.service;

import com.castro.domain.Post;
import com.castro.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Iterable<Post> getAllPost(){
        return postRepository.findAll();
    }
}
