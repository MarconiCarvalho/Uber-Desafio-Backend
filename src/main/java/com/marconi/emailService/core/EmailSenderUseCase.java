package com.marconi.emailService.core;

public interface EmailSenderUseCase {
    void sendEmail(String to, String subject, String body);
}
