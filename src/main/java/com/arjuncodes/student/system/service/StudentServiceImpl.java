package com.arjuncodes.student.system.service;

import com.arjuncodes.student.system.model.Student;
import com.arjuncodes.student.system.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentServiceImpl implements StudentService {
    @Autowired

    private StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);

    }
    @Override
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

}
