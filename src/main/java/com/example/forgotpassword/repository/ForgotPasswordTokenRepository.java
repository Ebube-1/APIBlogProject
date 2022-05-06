package com.example.forgotpassword.repository;

import com.example.forgotpassword.entity.ForgotPasswordToken;
import com.example.forgotpassword.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
public interface ForgotPasswordTokenRepository extends JpaRepository<ForgotPasswordToken, Long> {

    @Transactional(Transactional.TxType.REQUIRES_NEW)
    void deleteByUserId(Long userId);

    Optional<ForgotPasswordToken> findByUser(User user);
}
