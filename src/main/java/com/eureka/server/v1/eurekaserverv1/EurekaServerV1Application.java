package com.eureka.server.v1.eurekaserverv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerV1Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerV1Application.class, args);
    }

}
