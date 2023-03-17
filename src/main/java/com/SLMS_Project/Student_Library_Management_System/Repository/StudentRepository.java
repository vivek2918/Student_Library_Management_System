package com.SLMS_Project.Student_Library_Management_System.Repository;

import com.SLMS_Project.Student_Library_Management_System.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {

    //only write the abstract function
    Student findByEmail(String email);
    List<Student> findByCountry(String country);
}
