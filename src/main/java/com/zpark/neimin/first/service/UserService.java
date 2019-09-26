package com.zpark.neimin.first.service;

import com.zpark.neimin.first.dao.UserMapper;
import com.zpark.neimin.first.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public User selByName(String name){
        return userMapper.selByName(name);
    }
}
