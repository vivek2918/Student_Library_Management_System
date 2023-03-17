package com.SLMS_Project.Student_Library_Management_System.Controller;

import com.SLMS_Project.Student_Library_Management_System.Service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/card")
public class CardController {

    @Autowired
    CardService cardService;

    @GetMapping("/get_bookIssued/{id}")
    public List<String> getBookIssuedToCard(@PathVariable("id") int id){
        return cardService.getBookIssuedToCard(id);
    }
}
