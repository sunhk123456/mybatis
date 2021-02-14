package com.shk.dao;

import com.shk.pojo.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {
    @Select("select * from student")
    List<Student> getStudent();

    List<Student> getStudentx();
    List<Student> getStudent2();
}
