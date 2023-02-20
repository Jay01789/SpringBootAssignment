package com.example.urlCount.controller;

import com.example.urlCount.model.visit;
import com.example.urlCount.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/visitor-count")

public class UrlController {
    @Autowired
    private UrlService urlService;
    @GetMapping("count")

    public visit getCount(){
        return urlService.getCounts();

    }
}
