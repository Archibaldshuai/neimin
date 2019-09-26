package com.zpark.neimin.first.dao;


import com.zpark.neimin.first.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User selByName(String name);
}
