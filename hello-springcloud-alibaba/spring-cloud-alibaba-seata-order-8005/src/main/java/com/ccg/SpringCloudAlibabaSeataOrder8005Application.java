package com.ccg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication(scanBasePackages = "com.ccg")
public class SpringCloudAlibabaSeataOrder8005Application {
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudAlibabaSeataOrder8005Application.class, args);
	}
}