package com.mstftikir.github.blog.services;

import com.mstftikir.github.blog.entities.Commentary;
import com.mstftikir.github.blog.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public List<Commentary> getComments(Long postId) {
        return commentRepository.findByPostId(postId);
    }

    public void comment(Commentary comment) {
        commentRepository.save(comment);
    }

    public boolean deletePost(Long id) {
        commentRepository.deleteById(id);
        return true;
    }
}
