package com.zpark.neimin.first.dao;


import com.zpark.neimin.first.model.DynamicUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DynamicMapper {
    List<DynamicUser> getDynamicUser(DynamicUser dynamicUser);
}
