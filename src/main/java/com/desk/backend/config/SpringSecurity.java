package com.desk.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SpringSecurity  {
   @Bean
       public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
           http
                   .authorizeHttpRequests((authz) -> authz
                           .requestMatchers("/public/**").permitAll()
                           .requestMatchers("/home/**").permitAll() // Permite acesso livre a `/public/**`
                           .anyRequest().permitAll() // Requer autenticação para qualquer outra requisição
                   ).httpBasic(); // Habilita autenticação básica
           return http.build();
       }
    
}
