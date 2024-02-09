package com.waifustorage.api.services.impl;

import com.waifustorage.api.dto.HashingAlgorithmCreationDTO;
import com.waifustorage.api.model.auth.HashingAlgorithms;
import com.waifustorage.api.repository.HashingAlgorithmsRepository;
import com.waifustorage.api.services.HashingAlgorithmsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HashingAlgorithmsServiceImpl implements HashingAlgorithmsService {

    final HashingAlgorithmsRepository hashingAlgorithmsRepository;

    HashingAlgorithmsServiceImpl(HashingAlgorithmsRepository hashingAlgorithmsRepository) {
        this.hashingAlgorithmsRepository = hashingAlgorithmsRepository;
    }

    @Override
    public List<HashingAlgorithms> getAllHashingAlgorithms() {
        return hashingAlgorithmsRepository.findAll();
    }

    @Override
    public HashingAlgorithms createHashingAlgorithm(HashingAlgorithmCreationDTO hashingAlgorithmCreationDTO) {
        HashingAlgorithms newHashAlgorithm = HashingAlgorithms.builder().build();
        newHashAlgorithm.setAlgorithmName(hashingAlgorithmCreationDTO.getName());
        return hashingAlgorithmsRepository.save(newHashAlgorithm);
    }
}
