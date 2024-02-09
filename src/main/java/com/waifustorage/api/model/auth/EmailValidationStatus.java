package com.waifustorage.api.model.auth;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "email_validation_status")
public class EmailValidationStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "StatusDescription",length = 20,nullable = false)
    private String  statusDescription;

    //Relacion uno a muchos
    @OneToMany(mappedBy = "emailValidationStatus")
    private List<UserLoginData> userLoginDataList;
}
