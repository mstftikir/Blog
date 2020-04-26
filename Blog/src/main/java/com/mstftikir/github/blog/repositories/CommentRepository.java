package com.mstftikir.github.blog.repositories;

import com.mstftikir.github.blog.entities.Commentary;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Commentary,Long> {
    List<Commentary> findByPostId(Long postId);
}
