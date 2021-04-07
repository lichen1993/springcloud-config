package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer		//开启config-server
public class ConfigApplicationServer3344 {
	public static void main(String[] args) {
        SpringApplication.run(ConfigApplicationServer3344.class, args);
    }
}
