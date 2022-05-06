package com.example.forgotpassword.service.impl;

import com.example.forgotpassword.dto.EmailDto;
import com.example.forgotpassword.service.EmailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@ConditionalOnProperty(name = "app.email.service-type", havingValue = "mock")
public class MockEmailServiceImpl implements EmailService {

    @Override
    public void sendEmail(EmailDto emailDto) {
        log.info("email: " + emailDto);
    }
}
