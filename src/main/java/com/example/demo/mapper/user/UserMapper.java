package com.example.demo.mapper.user;

import com.example.demo.entity.user.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<User> getAll();
}
