package com.waifustorage.api.repository;

import com.waifustorage.api.model.auth.UserLoginData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLoginDataRepository extends JpaRepository<UserLoginData,Integer> {

}
