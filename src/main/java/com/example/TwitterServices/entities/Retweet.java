package com.example.TwitterServices.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "retweets")
public class Retweet extends BaseEnitity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String userId;



    @ManyToOne
    @JoinColumn(name = "tweet_id")
    private Twitter tweet;


}
