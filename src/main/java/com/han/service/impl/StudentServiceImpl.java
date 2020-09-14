package com.han.service.impl;

import com.han.mapper.StudentMapper;
import com.han.pojo.Student;
import com.han.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by macro on 16:30 2020/9/9
 */

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> All() {
        return studentMapper.All();
    }

    @Override
    public int del(int id) {
        return studentMapper.del(id);
    }

    @Override
    public void save(Student stu) {
        studentMapper.save(stu);
    }
}
