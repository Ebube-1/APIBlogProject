package com.example.forgotpassword.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users")
public class User extends BaseEntity{

    private String email;
    private String passwordHash;
}
