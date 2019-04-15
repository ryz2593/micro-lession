package com.ryz2593;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ryz2593
 */
@SpringBootApplication
@EnableDiscoveryClient   //启用客户端服务发现
public class CloudConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConsumerApplication.class, args);
	}

}
