package com.desk.backend.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {

    @Bean
    public OpenAPI open(){
        return new OpenAPI()
                .info(new Info().title("API Service desk")
                        .version("1.0.0")
                        .description("Documentação para API Service Desk")

                )
                ;
    }
}
