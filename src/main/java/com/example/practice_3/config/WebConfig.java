package com.example.practice_3.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Properties;

@Configuration
@PropertySource("classpath:application.properties")
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private Environment env;

    @Bean
    public JavaMailSenderImpl javaMailSender(){
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost(env.getProperty("mail.host"));
        mailSender.setPort(Integer.parseInt(env.getProperty("mail.port")));
        mailSender.setUsername(env.getProperty("mail.username"));
        mailSender.setPassword(env.getProperty("mail.password"));
        Properties properties = mailSender.getJavaMailProperties();
        properties.put(env.getProperty("mail.protocol"), env.getProperty("mail.protocol.value"));
        properties.put(env.getProperty("mail.auth"), env.getProperty("mail.auth.value"));
        properties.put(env.getProperty("mail.starttls"), env.getProperty("mail.starttls.value"));
        properties.put(env.getProperty("mail.mail.debug"), env.getProperty("mail.mail.debug.value"));
        return mailSender;

    }
}
