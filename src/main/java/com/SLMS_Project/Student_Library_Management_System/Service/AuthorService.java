package com.SLMS_Project.Student_Library_Management_System.Service;


import com.SLMS_Project.Student_Library_Management_System.DTOs.AuthorEntryDto;
import com.SLMS_Project.Student_Library_Management_System.DTOs.AuthorResponseDto;
import com.SLMS_Project.Student_Library_Management_System.DTOs.BookResponseDto;
import com.SLMS_Project.Student_Library_Management_System.Models.Author;
import com.SLMS_Project.Student_Library_Management_System.Models.Book;
import com.SLMS_Project.Student_Library_Management_System.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorService {

   @Autowired
   AuthorRepository authorRepository;
    public String createAuthor(AuthorEntryDto authorEntryDto){

        Author author = new Author();

        author.setName(authorEntryDto.getName());
        author.setAge(authorEntryDto.getAge());
        author.setCountry(authorEntryDto.getCountry());
        author.setRating(authorEntryDto.getRating());

        authorRepository.save(author);
        return "Author added successfully";
    }

    public List<String> findAllBook(int id) {
        Author author=authorRepository.findById(id).get();

        List<Book>books = author.getBooksWritten();
        List<String>bookNames = new ArrayList<>();

        for(Book book: books){
            String name = book.getName();
            bookNames.add(name);
        }
        return bookNames;
    }

    public AuthorResponseDto getAuthor(Integer authorId){

        Author author =  authorRepository.findById(authorId).get();
        AuthorResponseDto authorResponseDto = new AuthorResponseDto();
        //Set its attributes.
        //List<Book> --> List<BookResponseDto>
        List<Book> bookList = author.getBooksWritten();

        List<BookResponseDto> bookResponseList = new ArrayList<>();

        for(Book b : bookList){

            BookResponseDto bookResponseDto = new BookResponseDto();
            bookResponseDto.setGenre(b.getGenre());
            bookResponseDto.setPages(b.getPages());
            bookResponseDto.setName(b.getName());

            bookResponseList.add(bookResponseDto);
        }
        //Set attributes for authorResponse Dto
        authorResponseDto.setBooksWritten(bookResponseList);
        authorResponseDto.setName(author.getName());
        authorResponseDto.setAge(author.getAge());
        authorResponseDto.setCountry(author.getCountry());
        authorResponseDto.setRating(author.getRating());

        return authorResponseDto;
    }
}
