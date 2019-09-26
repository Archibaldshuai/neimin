package com.zpark.neimin.first.dao;

import com.zpark.neimin.first.common.BaseModelExample;
import com.zpark.neimin.first.model.School;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchoolMapper {
   List<School> getSchoolData(BaseModelExample baseModelExample);

   int updateSchool(School schoolInfo);
}
