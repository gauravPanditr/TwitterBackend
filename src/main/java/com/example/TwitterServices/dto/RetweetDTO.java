package com.example.TwitterServices.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RetweetDTO {


    private Long id;
    private TwitterDTO retweetedTweet;
}
