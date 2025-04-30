package com.spring_ai_tut.playg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    @GetMapping()
    public String generate(
            @RequestParam()
    ){

        return "Hello World!";
    }
}
