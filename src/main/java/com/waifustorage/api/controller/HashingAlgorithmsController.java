package com.waifustorage.api.controller;

import com.waifustorage.api.dto.HashingAlgorithmCreationDTO;
import com.waifustorage.api.model.auth.HashingAlgorithms;
import com.waifustorage.api.services.HashingAlgorithmsService;
import jakarta.transaction.Transactional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/waifuStorage/v1/authentication")
public class HashingAlgorithmsController {

    final HashingAlgorithmsService hashingAlgorithmsService;

    HashingAlgorithmsController(HashingAlgorithmsService hashingAlgorithmsService){
        this.hashingAlgorithmsService=hashingAlgorithmsService;
    }

    @GetMapping("/HashingAlgorithms")
    public ResponseEntity<List<HashingAlgorithms>>getAllHashingAlgorithms(){
       return new ResponseEntity<>(hashingAlgorithmsService.getAllHashingAlgorithms(), HttpStatus.OK);
    }

    @Transactional()
    @PostMapping("/HashingAlgorithms/create")
    public ResponseEntity<HashingAlgorithms>createHashAlgorithm(@RequestBody HashingAlgorithmCreationDTO hashingAlgorithmCreationDTO){
        return new ResponseEntity<>(hashingAlgorithmsService.createHashingAlgorithm(hashingAlgorithmCreationDTO), HttpStatus.CREATED);
    }


}
