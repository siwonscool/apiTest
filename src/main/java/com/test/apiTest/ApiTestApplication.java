package com.test.apiTest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class ApiTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiTestApplication.class, args);

		for (int i = 0; i < 10; i++) {
			log.info(i+"");
			log.debug(i+"");
			log.error(i+"");
			log.warn(i+"");
		}
	}

}
