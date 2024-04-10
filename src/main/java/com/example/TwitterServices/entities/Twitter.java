package com.example.TwitterServices.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Twitter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String Content;




}
