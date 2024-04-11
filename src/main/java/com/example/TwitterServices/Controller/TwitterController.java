package com.example.TwitterServices.Controller;

import com.example.TwitterServices.dto.TwitterCreateDTO;
import com.example.TwitterServices.service.TwitterServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwitterController {

    private final TwitterServices twitterServices;

    @Autowired
    public TwitterController(TwitterServices twitterServices) {
        this.twitterServices = twitterServices;
    }

    @PostMapping("/tweets")
    public ResponseEntity<String> createTweet(@RequestBody TwitterCreateDTO tweetDTO, @RequestHeader("userId") String userId) {
        twitterServices.createTwitter(tweetDTO, userId);
        return ResponseEntity.status(HttpStatus.CREATED).body("Tweet created successfully");
    }
}
