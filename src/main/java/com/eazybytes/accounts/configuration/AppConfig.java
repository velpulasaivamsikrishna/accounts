package com.eazybytes.accounts.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public OpenAPI openAPI(){
        return new OpenAPI().info(new Info()
                .title("Accounts Microservice API")
                .description("Eazy-Bank REST APIs for Accounts Microservice")
                .version("v1")
                .contact(new Contact()
                        .name("Sai Vamsi Krishna")
                        .email("sai@gmail.com"))
                .license(new License().name("Apache 2.0")
                )
        );
    }
}
