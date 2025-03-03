package com.example.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "books")
@Data  // Lombok annotation to generate getters, setters, and toString
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String title;
    private String author;
    private double price;
}