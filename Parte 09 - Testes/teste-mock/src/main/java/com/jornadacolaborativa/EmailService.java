package com.jornadacolaborativa;

public class EmailService {

    private SendEmail sendEmail;

    public EmailService(SendEmail sendEmail) {
        this.sendEmail = sendEmail;
    }

    public boolean sendEmail(Object mail) {
        return sendEmail.send(mail);
    }
}
