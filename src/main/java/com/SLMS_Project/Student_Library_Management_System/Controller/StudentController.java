package com.SLMS_Project.Student_Library_Management_System.Controller;

import com.SLMS_Project.Student_Library_Management_System.DTOs.StudentUpdateMobileRequestDto;
import com.SLMS_Project.Student_Library_Management_System.Models.Student;
import com.SLMS_Project.Student_Library_Management_System.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public String createStudent(@RequestBody Student studet){
        return studentService.createStudent(studet);
    }

    @GetMapping("/getStudentNameByEmail") //localhost:8080/student/getStudentNameByEmail?email=biswalbibhuti8@gmail.com
    public String getStudentNameByEmail(@RequestParam("email") String email){
        return studentService.getStudentNameByEmail(email);
    }

    @GetMapping("/getStudentFromCountry")
    public List<String> getStudentFromCountry(@RequestParam("country") String country){
        return studentService.getStudentFromCountry(country);
    }

    @PutMapping("/updateMobile")
    public String updateMobNo(@RequestBody StudentUpdateMobileRequestDto student){
        return studentService.updateMobNo(student);
    }

    @GetMapping("/book_issued")
    public List<String> findBookIssuedToStudent(@RequestParam("id") int id){
        return studentService.findBookIssuedToStudent(id);
    }

}
