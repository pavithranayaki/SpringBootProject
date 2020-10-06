package com.example.studentDetails.Dao;

import com.example.studentDetails.Entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends CrudRepository<Student,Integer> {
}
