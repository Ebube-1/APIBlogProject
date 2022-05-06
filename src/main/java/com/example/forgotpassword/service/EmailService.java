package com.example.forgotpassword.service;

import com.example.forgotpassword.dto.EmailDto;

public interface EmailService {
    void sendEmail(EmailDto emailDto);
}
