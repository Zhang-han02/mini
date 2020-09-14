package com.han.service;

import com.han.pojo.Student;

import java.util.List;

/**
 * Created by macro on 16:30 2020/9/9
 */
public interface StudentService {
    public List<Student> All();
    public int del(int id);
    public void save(Student stu);
}
