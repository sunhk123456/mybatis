package com.shk.dao;

import com.shk.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {


    //获取老师
    List<Teacher> getTeacher();
    //获取指定老师下的所有学生信息
    Teacher getTeacher1(@Param("tid") int id );

}
