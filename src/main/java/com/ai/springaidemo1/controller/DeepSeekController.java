package com.ai.springaidemo1.controller;

import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeepSeekController {
    @Autowired
    private OpenAiChatModel openAiChatModel;

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "message", defaultValue = "hello") String message) {
        String result = openAiChatModel.call(message);
        System.out.println(result);
        return result;
    }
}
