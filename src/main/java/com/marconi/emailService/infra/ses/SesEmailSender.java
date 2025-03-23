package com.marconi.emailService.infra.ses;

import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.model.*;
import com.marconi.emailService.adapters.EmailSenderGatway;
import org.springframework.beans.factory.annotation.Autowired;

import javax.naming.Context;

public class SesEmailSender implements EmailSenderGatway {

    private final AmazonSimpleEmailService amazonSimpleEmailService;

    @Autowired
    public SesEmailSender(AmazonSimpleEmailService amazonSimpleEmailService) {
        this.amazonSimpleEmailService = amazonSimpleEmailService;
    }


    @Override
    public void sendEmail(String to, String subject, String body) {
        SendEmailRequest request = new SendEmailRequest()
                .withSource("marconi.caravalho.bcc@gmail.com")
                .withDestination(new Destination().withToAddresses(to))
                .withMessage(new Message()
                    .withSubject(new Content(subject))
                        .withBody(new Body().withText(new Content(body)))
                );
        try{
            this.amazonSimpleEmailService.sendEmail(request);
        }catch (){

        }

    }
}
