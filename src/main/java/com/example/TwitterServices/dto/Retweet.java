package com.example.TwitterServices.dto;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
public class Retweet {
    private Long originalTweetId;

    @Size(min = 3,max = 250)
    @NotEmpty
    private String content;



}
