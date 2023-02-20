package com.example.urlCount.service;


import com.example.urlCount.model.visit;
import org.springframework.stereotype.Service;

@Service
public class UrlService {
     static int  count = 0 ;

    public visit getCounts(){
        visit Visit = new visit(++count);
        return Visit ;
    }

}
