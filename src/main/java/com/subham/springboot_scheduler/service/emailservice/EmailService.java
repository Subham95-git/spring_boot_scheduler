package com.subham.springboot_scheduler.service.emailservice;

import com.subham.springboot_scheduler.data.emaildata.EmailData;
import org.springframework.http.ResponseEntity;

public interface EmailService {
    ResponseEntity<String> sendSimpleMail(EmailData emailDetails);
    String sendMailWithAttachment(EmailData emailDetails);
}
