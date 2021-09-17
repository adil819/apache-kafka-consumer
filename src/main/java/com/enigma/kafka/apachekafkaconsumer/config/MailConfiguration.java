package com.enigma.kafka.apachekafkaconsumer.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class MailConfiguration {

    @Autowired
    private Environment environment;

    public JavaMailSender getMailSender() {
        JavaMailSender mailSender = new JavaMailSenderImpl();

    }

}
