package com.han.mapper;

import com.han.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.List;

/**
 * Created by macro on 16:29 2020/9/9
 */

//使用全局配置代替
//@Mapper
public interface StudentMapper {

    public List<Student> All();
    public int del(int id);
    public void save(Student stu);
}
