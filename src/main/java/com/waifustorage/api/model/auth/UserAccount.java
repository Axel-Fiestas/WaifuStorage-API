package com.waifustorage.api.model.auth;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "user_account")
@Inheritance(strategy = InheritanceType.JOINED)
public class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Column(name = "FirstName",length = 100,nullable = false)
    private String firstName;

    @Column(name = "LastName",length = 100,nullable = false)
    private String lastName;

    @Column(name = "Gender",length = 1,nullable = false)
    private Character gender;

    @Column(name = "DateOfBirth",nullable = false)
    private Date dateOfBirth;

}
