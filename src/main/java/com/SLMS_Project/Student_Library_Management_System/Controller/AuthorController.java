package com.SLMS_Project.Student_Library_Management_System.Controller;

import com.SLMS_Project.Student_Library_Management_System.DTOs.AuthorEntryDto;
import com.SLMS_Project.Student_Library_Management_System.DTOs.AuthorResponseDto;
import com.SLMS_Project.Student_Library_Management_System.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @PostMapping("/add")
    public String createAuthor(@RequestBody AuthorEntryDto authorEntryDto){
        return authorService.createAuthor(authorEntryDto);
    }

    @GetMapping("/all_books") //localhost:8080/author/all_books?author_id=1
    public List<String> findAllBook(@RequestParam("author_id") int id){
        return authorService.findAllBook(id);
    }
    @GetMapping("get")
    public AuthorResponseDto getAuthor(@RequestParam("id") int id){
        return authorService.getAuthor(id);
    }
}
