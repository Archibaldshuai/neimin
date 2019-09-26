package com.zpark.neimin.first.service;


import com.zpark.neimin.first.dao.DynamicMapper;
import com.zpark.neimin.first.model.DynamicUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DynamicService {
    @Autowired
    DynamicMapper dynamicMapper;

    public List<DynamicUser> getDynamicUser (DynamicUser dynamicUser){
        return  dynamicMapper.getDynamicUser(dynamicUser);
    }

}
