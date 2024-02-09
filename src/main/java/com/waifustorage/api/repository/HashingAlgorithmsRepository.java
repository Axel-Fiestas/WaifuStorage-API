package com.waifustorage.api.repository;

import com.waifustorage.api.model.auth.HashingAlgorithms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HashingAlgorithmsRepository extends JpaRepository<HashingAlgorithms,Integer> {

}
