package com.wzy.dubbo.web;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class DubboWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboWebApplication.class, args);
	}

}
