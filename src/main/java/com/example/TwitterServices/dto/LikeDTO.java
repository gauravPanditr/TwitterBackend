package com.example.TwitterServices.dto;

import lombok.*;

@Data

@AllArgsConstructor
@NoArgsConstructor
public class LikeDTO {
    private Long id;

    private TwitterDTO tweet;

    private String profileId;



}
