package com.mstftikir.github.blog.repositories;

import com.mstftikir.github.blog.entities.Post;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {

    List<Post> findByCreatorId(Long id);
}
