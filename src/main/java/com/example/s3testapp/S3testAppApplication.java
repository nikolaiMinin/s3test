package com.example.s3testapp;

import com.example.s3testapp.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S3testAppApplication {

    public static void main(String[] args) {

        SpringApplication.run(S3testAppApplication.class, args);


    }

}
