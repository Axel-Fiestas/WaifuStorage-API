package com.waifustorage.api.model.auth;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "user_login_data_external")
@PrimaryKeyJoinColumn(referencedColumnName = "UserId")
public class UserLoginDataExternal extends UserAccount{

    @Column(name = "ExternalProviderId",nullable = false)
    private int externalProviderId;

    @Column(name = "ExternalProviderToken",length = 100,nullable = false)
    private String externalProviderToken;
}
