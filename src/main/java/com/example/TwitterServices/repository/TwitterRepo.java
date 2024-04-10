package com.example.TwitterServices.repository;


import com.example.TwitterServices.entities.Twitter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TwitterRepo extends JpaRepository<Twitter,String> {



}
