package com.SLMS_Project.Student_Library_Management_System.Service;

import com.SLMS_Project.Student_Library_Management_System.Models.Card;
import com.SLMS_Project.Student_Library_Management_System.Repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CardService {
    @Autowired
    CardRepository cardRepository;

    public List<String> getBookIssuedToCard(int id) {
        Card card=cardRepository.findById(id).get();
        List<String>books=new ArrayList<>();

        return books;
    }
}
