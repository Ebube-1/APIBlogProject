package com.example.forgotpassword.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class EmailDto {
    private String recipientEmail;
    private String subject;
    private String message;
}
