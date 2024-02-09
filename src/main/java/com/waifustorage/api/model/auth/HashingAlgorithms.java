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
@Table(name = "hashing_algorithms")
public class HashingAlgorithms {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "AlgorithmName",nullable = false)
    private String AlgorithmName;

    //Relacion uno a muchos
    @OneToMany(mappedBy = "hashingAlgorithm")
    private List<UserLoginData> userLoginDataList;

}
