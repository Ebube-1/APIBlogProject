package com.example.forgotpassword.service;

import com.example.forgotpassword.dto.request.ForgotPasswordRequest;
import com.example.forgotpassword.dto.request.ResetPasswordRequest;
import com.example.forgotpassword.dto.response.MessageResponse;
import org.springframework.http.ResponseEntity;

public interface UserManagementService {

    ResponseEntity<MessageResponse> forgotPassword(ForgotPasswordRequest request);

    ResponseEntity<MessageResponse> resetPassword(ResetPasswordRequest request);
}
