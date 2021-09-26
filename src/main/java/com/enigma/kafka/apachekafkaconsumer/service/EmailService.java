package com.enigma.kafka.apachekafkaconsumer.service;


import com.enigma.kafka.apachekafkaconsumer.model.Email;

public interface EmailService {
    void sendMail(Email email);
}
