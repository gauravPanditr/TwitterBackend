package com.example.TwitterServices.service;

import com.example.TwitterServices.client.ProfileServiceClient;
import com.example.TwitterServices.dto.TwitterDTO;
import com.example.TwitterServices.entities.Twitter;
import com.example.TwitterServices.repository.TwitterRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TwitterService {
    public static final Logger logger = LoggerFactory.getLogger(TwitterService.class);
    @Autowired
    private TwitterRepo twitterRepository;

    @Autowired
    private ProfileServiceClient profileServiceClient;

    // Assuming you have a property for storing the JWT token

    public Twitter createTweet(TwitterDTO twitterDTO, String loggedInUserId) {
        // Retrieve additional information about the logged-in user
        UserInfo profileResponse = profileServiceClient.getUserDetails(loggedInUserId);

        // Extract user information from the profile response
        String profileId = profileResponse.getUserId();
        String username = profileResponse.getUsername();

        // Create a new Twitter entity from the DTO and retrieved user details
        Twitter twitter = Twitter.builder()
                .text(twitterDTO.getText())
                .profileId(profileId)
                .username(username)
                .imageUrl(twitterDTO.getImageUrl())
                .createdAt(LocalDateTime.now())
                .build();

        // Save the tweet
        return twitterRepository.save(twitter);
    }
}