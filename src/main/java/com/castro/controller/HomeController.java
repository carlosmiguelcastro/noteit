package com.castro.controller;

import com.castro.domain.Post;
import com.castro.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    private PostService postService;

    public HomeController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public String home(Model model) {
        Iterable<Post> allPosts = postService.getAllPost();
        model.addAttribute("post", new Post());
        model.addAttribute("allposts", allPosts);
        return "index";
    }

    @PostMapping("/")
    public String addPost(@ModelAttribute Post post) {
        postService.addPost(post.getTitle(), post.getContent());
        return "redirect:/";
    }

    @GetMapping("/post/{id}")
    public String delPost(@PathVariable(value = "id") String id) {
        postService.delPost(Integer.valueOf(id));
        return "redirect:/";
    }
}
