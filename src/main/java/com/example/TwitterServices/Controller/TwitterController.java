package com.example.TwitterServices.Controller;

import com.example.TwitterServices.dto.TwitterDTO;
import com.example.TwitterServices.entities.Twitter;
import com.example.TwitterServices.service.TwitterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwitterController {
    private static final Logger logger = LoggerFactory.getLogger(TwitterController.class);

    @Autowired
    private TwitterService twitterService;

    @PostMapping("/tweets")
    public ResponseEntity<Twitter> createTweet(@RequestBody TwitterDTO twitterDTO, @RequestHeader("loggedInUserId") String loggedInUserId) {
        Twitter tweet = twitterService.createTweet(twitterDTO, loggedInUserId);
        return ResponseEntity.ok(tweet);
    }
}
