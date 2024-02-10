package com.waifustorage.api.config;

import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

public class DelegatingPasswordEncoder {
    PasswordEncoder passwordEncoder=
            PasswordEncoderFactories.createDelegatingPasswordEncoder();
}
