package com.example.TwitterServices.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommentDTO {
    private Long id;
    private TwitterDTO quotedTweet;
}
