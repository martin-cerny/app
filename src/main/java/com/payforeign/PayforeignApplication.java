package com.payforeign;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration(exclude = 
            LiquibaseAutoConfiguration.class
          )
@EnableJpaRepositories("com.payforeign")
public class PayforeignApplication {

    @Value("${some.prop}")
    private static String prop;

    public static void main(String[] args) {
        SpringApplication.run(PayforeignApplication.class, args);
        System.out.println(prop);
    }
    

    @RestController
    static class PayforeignController {

        @RequestMapping("/running")
        public ResponseEntity<String> payforeign() {
            return ResponseEntity.ok("I'm running on Oracle Java 8");
        }

    }
}
