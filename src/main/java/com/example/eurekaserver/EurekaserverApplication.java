package com.example.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *
 * 没有连接数据库的时候报错  需要加上这一句@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
 * @author qinyang
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableEurekaServer
public class EurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaserverApplication.class, args);
	}
}
