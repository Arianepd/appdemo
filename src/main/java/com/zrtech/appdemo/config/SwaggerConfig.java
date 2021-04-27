package com.zrtech.appdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import springfox.documentation.builders.ApiInfoBuilder;
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

    private static final String BOOK_STORE_MANAGER_DEMO = "BookStore Manager Demo";
    private static final String BOOK_TITLE = "API para BookStore Manager";
    private static final String BOOK_VERSION = "1.0.0";
    private static final String BOOKS_CONTACT = "Ariane Coelho";
    private static final String BOOK_URL = "github.com/arianepd";
    private static final String BOOK_EMAIL = "ariane-clh@hotmail.com";

    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage(BOOK_STORE_MANAGER_DEMO))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(builApiInfo());
    }


    private ApiInfo builApiInfo() {
        return new ApiInfoBuilder()

                .title(BOOK_STORE_MANAGER_DEMO)
                .description(BOOK_TITLE)
                .version(BOOK_VERSION)
                .contact(new Contact(BOOKS_CONTACT, BOOK_URL, BOOK_EMAIL))
                .build();

    }

}