package com.example.TwitterServices.service;

import com.example.TwitterServices.constant.CommanConstant;
import com.example.TwitterServices.dto.TwitterCreateDTO;
import com.example.TwitterServices.entities.Twitter;
import com.example.TwitterServices.repository.TwitterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Service;

import java.net.http.HttpHeaders;

@Service
public class TwitterServices
{
     @Autowired
    private TwitterCreateDTO twitterCreateDTO;

     @Autowired
    private TwitterRepo twitterRepo;
     @KafkaListener(topics = CommanConstant.TWITTER_USR_ID,groupId = "twitter-group")
  public void createTwitter(TwitterCreateDTO twitterCreateDTO, @Header(KafkaHeaders.RECEIVED_KEY)String userId){
         Twitter entity = Twitter.builder()
                 .userId(userId)
                 .tweet(twitterCreateDTO.getTweet())
                         .build();

         twitterRepo.save(entity);


     }











}