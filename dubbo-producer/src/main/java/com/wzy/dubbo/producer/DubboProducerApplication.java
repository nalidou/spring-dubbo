package com.wzy.dubbo.producer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableDubboConfiguration
@SpringBootApplication
public class DubboProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboProducerApplication.class, args);
	}

}
