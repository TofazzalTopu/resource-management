//package com.itlize.backend.demo.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger.web.ApiKeyVehicle;
//import springfox.documentation.swagger.web.SecurityConfiguration;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//import static springfox.documentation.spi.DocumentationType.SWAGGER_2;
//
//@Profile("swagger")
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//    @Bean
//    public Docket api() {
//        return new Docket(SWAGGER_2)
//                .groupName("Disburse API")
//                .select()
//                .apis(RequestHandlerSelectors.any())
//                .apis(RequestHandlerSelectors.basePackage("com.itlize.backend.demo"))
//                .paths(PathSelectors.any())
//                .build()
//                .apiInfo(apiInfo());
//    }
//
//    @Bean
//    SecurityConfiguration security() {
//        return new SecurityConfiguration(
//                null,
//                null,
//                null, // realm Needed for authenticate button to work
//                null, // appName Needed for authenticate button to work
//                "",// apiKeyValue
//                ApiKeyVehicle.HEADER,
//                "accessToken", //apiKeyName
//                ",");
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title("Brac DCT Disbursement Api")
//                .description("Brac DCT disbursement api with swagger")
//                .contact("Md Tofazzal Hossain")
//                .license("ITC Version 2.0")
//                .version("2.0")
//                .build();
//    }
//}
