package com.marconi.emailService.application;

import com.marconi.emailService.adapters.EmailSenderGatway;
import com.marconi.emailService.core.EmailSenderUseCase;
import org.springframework.beans.factory.annotation.Autowired;

public class EmailSenderService implements EmailSenderUseCase {


    private final EmailSenderGatway emailSenderGatway;

    @Autowired
    public EmailSenderService(EmailSenderGatway emailSenderGatway, EmailSenderGatway emailSenderGatway1){
        this.emailSenderGatway = emailSenderGatway;
    }
    @Override
    public void sendEmail(String to, String subject, String body) {
    this.emailSenderGatway.sendEmail(to, subject, body);
    }
}
