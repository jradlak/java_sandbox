package com.jrd;

import com.jrd.config.HelloProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({ HelloProperties.class })
public class SpringHelloApplication {

	public static void main(String[] args) {
        SpringApplication.run(SpringHelloApplication.class, args);
	}
}
