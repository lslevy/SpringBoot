package com.example.demo.service.user;


import com.example.demo.entity.user.User;
import com.example.demo.mapper.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public List<User> getAll(){
        return userMapper.getAll();
    }

}
