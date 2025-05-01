package com.spring_ai_tut.playg;


import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    private final ChatClient chatClient;

    public ChatController(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }

    @GetMapping()
    public String generate(
            @RequestParam(value = "message", defaultValue = "tell ne about arsenal") String message
    ){
        return this.chatClient.prompt().user(message).call().content();
    }

    @GetMapping("/prompt")
    public String prompt(){
        return this.chatClient.prompt(new Prompt("tell ma about chelsea")).call().content();
    }
}
