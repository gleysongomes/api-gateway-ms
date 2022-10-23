package io.github.gleysongomes.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApiGatewayMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayMsApplication.class, args);
	}

}
