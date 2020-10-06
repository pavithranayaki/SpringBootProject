package com.example.studentDetails.Contoller;

import com.example.studentDetails.Entity.Student;
import com.example.studentDetails.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @RequestMapping(value = "/students",method = RequestMethod.GET)
    public List<Student> getAllStudents(){
        //System.out.println(studentService.getAllStudents());
        return studentService.getAllStudents();
    }

    @RequestMapping(value="/students/add",method= RequestMethod.POST)
    public void insertContact(@RequestBody Student student){
        studentService.saveStudent(student);
    }


}
