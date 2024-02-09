package com.waifustorage.api.model.auth;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "user_login_data")
@PrimaryKeyJoinColumn(referencedColumnName = "UserId")
public class UserLoginData extends UserAccount{

    @Column(name = "LoginName",length = 200,nullable = false)
    private String loginName;

    @Column(name = "PasswordHash",length = 250,nullable = false)
    private String passwordHash;

    @Column(name = "PasswordSalt",length = 100,nullable = false)
    private String passwordSalt;

    //Muchos a Uno relación
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "hashing_algorithm_id")
    private HashingAlgorithms hashingAlgorithm;

    @Column(name = "EmailAddress",length = 100,nullable = false)
    private String EmailAddress;

    @Column(name = "ConfirmationToken",length = 100)
    String ConfirmationToken;

    @Column(name = "TokenGenerationTime")
    private Timestamp TokenGenerationTime;

    //Muchos a uno relaciónf
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "email_description_status_id")
    private EmailValidationStatus emailValidationStatus;

    @Column(name = "PasswordRecoveryToken",length = 100)
    private String PasswordRecoveryToken;

    @Column(name = "RecoveryTokenTime")
    private Timestamp RecoveryTokenTime;




}
