package com.mstftikir.github.blog.services;

import com.mstftikir.github.blog.entities.Post;
import com.mstftikir.github.blog.entities.UserInfo;
import com.mstftikir.github.blog.repositories.PostRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }

    public void insert(Post post) {
        postRepository.save(post);
    }

    public List<Post> findByUser(UserInfo user){
        return postRepository.findByCreatorId(user.getId());
    }

    public boolean deletePost(Long postId){
        Optional<Post> thePost = postRepository.findById(postId);

        thePost.ifPresent(post -> postRepository.delete(post));
        return true;
    }

    public Post getPost(Long id) {
        Optional<Post> thePost = postRepository.findById(id);

        return thePost.orElseGet(Post::new);
    }
}
