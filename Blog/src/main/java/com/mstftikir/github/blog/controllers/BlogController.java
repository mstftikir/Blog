package com.mstftikir.github.blog.controllers;

import com.mstftikir.github.blog.entities.Post;
import com.mstftikir.github.blog.services.PostService;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BlogController {

    @Autowired
    private PostService postService;

    @GetMapping(value = "/")
    public String index() {
        return "index";
    }

    @GetMapping(value = "/posts")
    public List<Post> posts(){
        return postService.getAllPosts();
    }

    @PostMapping(value = "/post")
    public void publishPost(@RequestBody Post post){
        post.setDateGenerated(new Date());
        postService.insert(post);
    }

}
