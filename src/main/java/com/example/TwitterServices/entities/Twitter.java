package com.example.TwitterServices.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Twitter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

      private String userId;

    private String tweet;




}
