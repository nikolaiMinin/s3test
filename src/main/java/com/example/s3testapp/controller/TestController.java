package com.example.s3testapp.controller;

import com.example.s3testapp.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    FileService fileService;

    @GetMapping("list")
    public List<String> getAllfiles() {
        return fileService.listAllFiles();
    }

}
