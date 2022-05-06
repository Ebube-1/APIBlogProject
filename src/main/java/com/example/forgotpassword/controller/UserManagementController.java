package com.example.forgotpassword.controller;

import com.example.forgotpassword.dto.request.ForgotPasswordRequest;
import com.example.forgotpassword.dto.request.ResetPasswordRequest;
import com.example.forgotpassword.dto.response.MessageResponse;
import com.example.forgotpassword.service.UserManagementService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
@RequestMapping("/user-management")
@RequiredArgsConstructor
public class UserManagementController {

    private final UserManagementService userManagementService;

    @PostMapping("/forgot-password")
    public ResponseEntity<MessageResponse> forgotPassword(@Valid @RequestBody ForgotPasswordRequest request){
        return userManagementService.forgotPassword(request);
    }

    @PostMapping("/reset-password")
    public ResponseEntity<MessageResponse> resetPassword(@Valid @RequestBody ResetPasswordRequest request){
        return userManagementService.resetPassword(request);
    }
}
