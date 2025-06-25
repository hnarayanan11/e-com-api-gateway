package com.example.e_com_api_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EComApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(EComApiGatewayApplication.class, args);
	}

}
