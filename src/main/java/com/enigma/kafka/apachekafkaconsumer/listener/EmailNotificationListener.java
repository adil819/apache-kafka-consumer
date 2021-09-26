package com.enigma.kafka.apachekafkaconsumer.listener;

import com.enigma.kafka.apachekafkaconsumer.model.Email;
import com.enigma.kafka.apachekafkaconsumer.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationListener {

    @Autowired
    EmailService emailService;

    @KafkaListener(id = "foo", topics = "kafka-training")
    public void listener(String foo){
        System.out.println(foo);
        Email email = new Email("bootcamp.enigma@gmail.com", "ahmad.adil@xlfutureleaders.com", "Belajar Kirim Email dari Java & Kafka", foo);
        emailService.sendMail(email);
    }

}
