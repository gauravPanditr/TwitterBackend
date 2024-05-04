package com.example.TwitterServices.entities;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "comment")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Comment extends BaseEnitity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false)
    private String content;

   @Column(nullable = false)
   private String userId;


    @ManyToOne
    @JoinColumn(name = "tweets")
    private Twitter tweet;



}
