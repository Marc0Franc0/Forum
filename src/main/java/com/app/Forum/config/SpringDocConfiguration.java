package com.app.Forum.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfiguration {

//Bean para la configuración JWT en los endpoints de la documentación
    @Bean
    public OpenAPI customOpenApi(){
        return new
                OpenAPI()
                .info(new Info()
                        .title("Forum")
                        .description("El proyecto tiene la posibilidad de gestionar un foro, con el objetivo de facilitar la" +
                                " administración de tópicos dentro del mismo y con autenticación de usuarios.")
                        .version("1.0.0"))
                .components(new Components()
                        .addSecuritySchemes("Bearer Authentication",
                                new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .bearerFormat("JWT")
                                        .scheme("bearer")));

    }

}
