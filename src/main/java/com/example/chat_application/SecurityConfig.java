package com.example.chat_application;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration

public class SecurityConfig {
    @SuppressWarnings("removal")
    @Bean
    public SecurityFilterChain configure(HttpSecurity http) throws Exception{
        http
        .authorizeHttpRequests()
        .requestMatchers("/chat/")
        .permitAll()
        .anyRequest().authenticated()
        .and()
        .httpBasic();
        return http.build();
    }
}
