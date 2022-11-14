package com.hakaryzhang.dao;

import com.hakaryzhang.domain.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
public interface StudentDao {

    @Select("select * from student")
    List<Student> selectStudent();

    @Select("select * from student where sex=#{sex}")
    List<Student> selectStudent(@Param("sex") String sex);

    @Select("select * from student where id=#{id}")
    Student selectStudentById(@Param("id") String id);

    @Insert("insert student(id, name, sex) values (#{student.id}, #{student.name}, #{student.sex})")
    void addStudent(@Param("student") Student student);

}
