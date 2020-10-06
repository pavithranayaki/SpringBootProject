package com.example.studentDetails.Service;

import com.example.studentDetails.Dao.StudentDao;
import com.example.studentDetails.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentDao studentDao;
    public List<Student> getAllStudents(){
        List<Student> students=new ArrayList<>();
        studentDao.findAll().forEach(student -> students.add((student)));
        return students;
    }

    public void saveStudent(Student student){
        studentDao.save(student);
    }
}
