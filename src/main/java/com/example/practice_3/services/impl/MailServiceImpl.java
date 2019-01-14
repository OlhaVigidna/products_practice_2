package com.example.practice_3.services.impl;

import com.example.practice_3.services.MailServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

@Service
@PropertySource("classpath:application.properties")
public class MailServiceImpl implements MailServise{

    @Autowired
    private JavaMailSender javaMailSender;


    @Autowired
    private Environment env;

    public void send(String email, String message){
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = null;
        try {
            helper = new MimeMessageHelper(mimeMessage, true);
            mimeMessage.setFrom(new InternetAddress(env.getProperty("email.username")));
            helper.setTo(email);
            helper.setText(message, true);
//            helper.addAttachment("attachment", new MultipartFile() {
//            });
        }catch (MessagingException e){
            e.printStackTrace();
        }

    }
}
