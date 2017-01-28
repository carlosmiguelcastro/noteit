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

    public void addPost(String title, String content){
        postRepository.save(new Post(title, content));
    }

    public void delPost(Integer id){
        postRepository.delete(id);
    }

    public void changePost(Integer id, String content){
        Post post = postRepository.findOne(id);
        post.setContent(content);
        postRepository.save(post);
    }
}
