package com.mstftikir.github.blog.services;

import com.mstftikir.github.blog.entities.Post;
import com.mstftikir.github.blog.repositories.PostRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }

    public void insert(Post post){

        postRepository.save(post);
    }
}
