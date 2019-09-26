package com.zpark.neimin.first.controller;

import com.zpark.neimin.first.common.BaseModelExample;
import com.zpark.neimin.first.common.BaseResult;
import com.zpark.neimin.first.common.BootstrapTable;
import com.zpark.neimin.first.model.School;
import com.zpark.neimin.first.model.User;

import com.zpark.neimin.first.service.SchoolService;
import com.zpark.neimin.first.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Map;


@Controller
public class LoginController {
    @Autowired
    private UserService userService;
    @Autowired
    private SchoolService schoolService;

    @RequestMapping("/")
    public String Login() {
        return "login";
    }

    @RequestMapping("/login.json")
    @ResponseBody  //用于将Controller的方法返回的对象
    public BaseResult recieveDate(@RequestBody Map<String, Object> loginData) {
//        Map<String, Object> map = new HashMap<>();
//        String loginName = loginData.get("loginName").toString();
//        System.out.println(".......controller");
//        return map;

        BaseResult baseResult = new BaseResult();
        String loginName = loginData.get("loginName").toString();
        String loginPwd = loginData.get("loginPwd").toString();
        if (loginName != null) {
            User user = userService.selByName(loginName);
            System.out.println("..........from mysql............"+user);
            if (user.getPassWord().equals(loginPwd)) {
                baseResult.setSuccess(true);
            } else {
                baseResult.setSuccess(false);
            }
        }

        return baseResult;
    }

    @RequestMapping(value = "/index.html")
    public String test() {
        System.out.println("......index");
        return "index";
    }
    @RequestMapping("/school.html")
    public String school() {
        return "school";
    }



//    @RequestMapping("/table.html")
//    public String table(){
//        return "table";
//    }

    @RequestMapping("/getData")
    @ResponseBody
    public BootstrapTable getData() {
        //从数据库查数据
        //找service service这个服务会提供从数据库查询的功能

//        BaseModelExample baseModelExample = new BaseModelExample();
//        baseModelExample.setRowIndex(0);
//        baseModelExample.setPageSize(60);
        List<School> schoolData = schoolService.getSchoolData(null);

        return new BootstrapTable(60, schoolData);
    }
}