package com.mstftikir.github.blog.repositories;

import com.mstftikir.github.blog.entities.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserInfo,Long> {
    UserInfo findByUsername(String username);
}
