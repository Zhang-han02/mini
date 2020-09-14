package com.han.controller;

import com.han.api.ResultCode;
import com.han.api.StudentResult;
import com.han.pojo.Student;
import com.han.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by macro on 16:37 2020/9/9
 */

@Controller
public class MyController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("save")
    public ModelAndView save(){
        ModelAndView modelAndView = new ModelAndView();
        List<Student> studentList = studentService.All();
        modelAndView.addObject("studentList",studentList);
        modelAndView.setViewName("all");
        return modelAndView;
    }


    @RequestMapping(value = "all",method = RequestMethod.GET)
    @ResponseBody
    public StudentResult All(){
        List<Student> studentList = studentService.All();
        return StudentResult.success(studentList);
    }

    @RequestMapping(value = "del")
    @ResponseBody
    public String del(int id){
        studentService.del(id);
        return "删除成功";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    @ResponseBody
    public StudentResult add(Student stu){
        studentService.save(stu);
        return StudentResult.success(ResultCode.SUCCESS.getCode());
    }



}
