package com.zpark.neimin.first.service;


import com.zpark.neimin.first.common.BaseModelExample;
import com.zpark.neimin.first.dao.SchoolMapper;
import com.zpark.neimin.first.model.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {
    @Autowired
    SchoolMapper schoolMapper;
    public List<School> getSchoolData(BaseModelExample baseModelExample){
        return schoolMapper.getSchoolData(baseModelExample);
    }


    public int updateSchool(School schoolInfo) {
        return schoolMapper.updateSchool(schoolInfo);
    }
}
