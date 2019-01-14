package com.example.practice_3.services.impl;

import com.example.practice_3.services.MailServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:application.properties")
public class MailServiceImpl implements MailServise{

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public void send(String email, String message) {

    }

    @Autowired
    private Environment env;

    public void send(String email){

    }
}
