package com.example.TwitterServices.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
public class TwitterCreateDTO {
    private Long id;
    @Size(min = 3 , max = 250)
   @NotEmpty
    private String tweet;

    private Long userId;


}
