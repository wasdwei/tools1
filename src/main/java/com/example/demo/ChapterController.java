package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ChapterController {

      @GetMapping(value = "/hlleo")
    public String hlleo(){
        System.out.println("/hlleo");
        return "hell!";
    }
}
