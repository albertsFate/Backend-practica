package com.banregio.actividadbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ActividadBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActividadBackendApplication.class, args);
    }

}
