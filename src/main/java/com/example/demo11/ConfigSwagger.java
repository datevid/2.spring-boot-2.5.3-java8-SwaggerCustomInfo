package com.example.demo11;
import io.swagger.annotations.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.SecurityScheme;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class ConfigSwagger {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfoCustom());
    }

    private ApiInfo apiInfoCustom() {

        return new ApiInfoBuilder()
                .title("title")
                .version("app_version")
                .description("app_description")
                .contact(new Contact(
                        "app_contact_name",
                        "app_contact_web",
                        "app_contact_email"))
                .license("MIT License").licenseUrl("http://opensource.org/licenses/MIT")//
                .build();
    }
}
