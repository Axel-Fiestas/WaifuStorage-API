package com.waifustorage.api.services;

import com.waifustorage.api.dto.HashingAlgorithmCreationDTO;
import com.waifustorage.api.model.auth.HashingAlgorithms;

import java.util.List;

public interface HashingAlgorithmsService {

    List<HashingAlgorithms> getAllHashingAlgorithms();

    HashingAlgorithms createHashingAlgorithm (HashingAlgorithmCreationDTO hashingAlgorithmCreationDTO);
}
