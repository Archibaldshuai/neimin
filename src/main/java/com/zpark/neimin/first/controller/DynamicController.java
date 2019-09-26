package com.zpark.neimin.first.controller;


import com.zpark.neimin.first.model.DynamicUser;
import com.zpark.neimin.first.service.DynamicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/dynamic")
public class DynamicController {
    @Autowired
    DynamicService dynamicService;

    @RequestMapping("/")
    @ResponseBody
    public List<DynamicUser> dynamic(){
        DynamicUser dynamicUser = new DynamicUser();
        dynamicUser.setUsername("lucas3");
        dynamicUser.setSex("nv");
        List<DynamicUser> myUser = dynamicService.getDynamicUser(dynamicUser);
        System.out.println("....Are You Ok ???...."+myUser.size());
        return myUser;
    }

}
