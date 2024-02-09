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
@Table(name = "external_providers")
public class ExternalProviders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "ProviderName",nullable = false)
    private String ProviderName;

    @Column(name = "WSEndPoint",length = 200)
    private String wsEndPoint;

    //Relacion uno a muchos
    @OneToMany(mappedBy = "externalProviderId")
    private List<UserLoginDataExternal> userLoginDataExternalList;
}
