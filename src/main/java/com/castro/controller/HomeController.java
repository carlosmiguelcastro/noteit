package com.castro.controller;

import com.castro.domain.Post;
import com.castro.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    private PostService postService;

    public HomeController(PostService postService) {
        this.postService = postService;
    }

    @RequestMapping("/")
    public String home(Model model){
        Iterable<Post> allPosts = postService.getAllPost();
        model.addAttribute("allposts", allPosts);
        return "index";
    }
}
