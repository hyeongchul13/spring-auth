package com.sparta.springauth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class PasswordConfig { //passwordConfig P는 소문자로 등록됨

    @Bean // 암호화를 위한 추가
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}