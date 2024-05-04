package com.example.TwitterServices.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TwitterDTO {
    private String text;
    private String imageUrl;
}