package com.arjuncodes.student.system.repository;
import com.arjuncodes.student.system.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface StudentRepository extends JpaRepository<Student,Integer>{

}
