package com.subham.springboot_scheduler.controller;

import com.subham.springboot_scheduler.data.emaildata.EmailData;
import com.subham.springboot_scheduler.service.emailservice.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/sendmail")
    public ResponseEntity<String> sendMail(@RequestBody EmailData emailData){
        return emailService.sendSimpleMail(emailData);
    }
}
