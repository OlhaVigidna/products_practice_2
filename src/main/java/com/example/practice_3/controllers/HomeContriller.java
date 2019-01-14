package com.example.practice_3.controllers;

import com.example.practice_3.services.MailServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeContriller {

    @Autowired
    private MailServise mailServise;

    @PostMapping("/sendMessage")
    public String sendMessage(@RequestParam String email, @RequestParam String message){

        mailServise.send(email, message);
        return "redirect:/";
    }
}
