package com.enigma.kafka.apachekafkaconsumer.service;

import com.enigma.kafka.apachekafkaconsumer.model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService{

    @Autowired
    JavaMailSender mailSender;

    @Override
    public void sendMail(Email email) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(email.getEmailFrom());
        message.setTo(email.getEmailTo());
        message.setSubject(email.getEmailSubject());
        message.setText(email.getEmailBody());
        mailSender.send(message);
    }

}
