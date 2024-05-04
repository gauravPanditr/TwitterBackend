package com.example.TwitterServices.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tweets")
public class Twitter extends BaseEnitity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String userId;

    @Column(nullable = false,length = 255)
    private String content;

    @OneToMany(mappedBy = "tweets")
    private List<Retweet> retweets;

    @OneToMany(mappedBy = "tweets")
    private List<Like> likes;

    @OneToMany(mappedBy = "tweets")
    private List<Comment> comments;











}
