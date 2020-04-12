package com.mstftikir.github.blog.repositories;

import com.mstftikir.github.blog.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  PostRepository extends JpaRepository<Post, Long> {
}
