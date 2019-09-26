
package com.zpark.neimin.first.controller;

import com.zpark.neimin.first.common.BaseModelExample;
import com.zpark.neimin.first.common.BaseResult;
import com.zpark.neimin.first.common.BootstrapTable;
import com.zpark.neimin.first.common.QueryParam;
import com.zpark.neimin.first.model.School;
import com.zpark.neimin.first.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SchoolController {
    private int myId;
    @Autowired
    SchoolService schoolService;

    @RequestMapping(value = "/getSchoolData")
    @ResponseBody
    public BootstrapTable getSchoolData(@RequestBody(required = false) final QueryParam queryParam) {
        System.out.println(".....queryParam:" + queryParam);
        int index = queryParam.getPageNumber();
        int pageSize = queryParam.getPageSize();
        BaseModelExample baseModelExample =  new BaseModelExample();
        baseModelExample.setRowIndex(index);
        baseModelExample.setPageSize(pageSize);
        List<School> schoolData = schoolService.getSchoolData(baseModelExample);
        return new BootstrapTable(200, schoolData);
    }

    @RequestMapping("/school")
    public String school() {
        return "school";
    }

    @RequestMapping("/{id}/new")
    public String newEdit(@PathVariable int id){
        System.out.println(".....id："+id);
        myId = id;
        return "new";
    }

    @RequestMapping("/save.json")
    @ResponseBody
    public BaseResult save(@RequestBody School schoolInfo){
        System.out.println("......scInfo:"+schoolInfo);
        schoolInfo.setId(myId);
        int r = schoolService.updateSchool(schoolInfo);
        BaseResult baseResult = new BaseResult();
        if (r >0){
            baseResult.setResultCode("200");
        }else {
            baseResult.setResultCode("500");
        }
        return baseResult;
    }


    @RequestMapping("/dashboard")
    public String dashboard(){
        return null;
    }

}