package com.SLMS_Project.Student_Library_Management_System.Repository;

import com.SLMS_Project.Student_Library_Management_System.Models.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card,Integer> {
}
