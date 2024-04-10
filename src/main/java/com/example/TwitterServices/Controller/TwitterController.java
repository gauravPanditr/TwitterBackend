package com.example.TwitterServices.Controller;

import com.example.TwitterServices.service.TwitterServices;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
public class TwitterController {

    @Autowired
    private TwitterServices twitterServices;

    @PostMapping("/create-twitter")
    public void createTwitter(
            @RequestBody String msg,
            @RequestHeader("loggedInUser") String loggedInUser
    ) throws ParseException {
        try {
            twitterServices.createTwitter(msg, loggedInUser);
        } catch (org.jose4j.json.internal.json_simple.parser.ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
