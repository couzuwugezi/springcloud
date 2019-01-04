package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author liqiang
 */
@SpringBootApplication
@MapperScan(basePackages = "com.springcloud.dao")
public class ProvideApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProvideApplication.class, args);
	}
}
