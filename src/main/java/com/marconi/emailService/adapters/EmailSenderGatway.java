package com.marconi.emailService.adapters;

public interface EmailSenderGatway {
    void sendEmail(String to, String subject, String body);
}
