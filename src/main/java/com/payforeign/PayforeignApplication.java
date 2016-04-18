package com.payforeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class PayforeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(PayforeignApplication.class, args);
    }

    @RestController
    static class PayforeignController {

        @RequestMapping("/running")
        public ResponseEntity<String> payforeign() {
            return ResponseEntity.ok("I'm running on Oracle Java 8");
        }

    }
}
