package com.arjuncodes.student.system.service;
import com.arjuncodes.student.system.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();

}