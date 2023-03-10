package com.app.amrit.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket apiDoc(){
        return new Docket(DocumentationType .SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.app.amrit.rest"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    public ApiInfo apiInfo(){
        return new ApiInfo(
          "Spring Boot REST API",
          "Spring Boot REST API for Demo Application",
          "1.0",
          "Terms of Service",
          new Contact(
                  "Amrit",
                  "http://www.dev-amrit.com/",
                  "amritcsadhikari@gmail.com"
          ),
          "Apache License Version 2.0",
          "https://www.apache/org/licenses/LICESNSE-2.0"
        );
    }
}
