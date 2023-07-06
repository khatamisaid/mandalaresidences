package com.dreamtown.mandalaresidences;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.dreamtown.mandalaresidences.config.PasswordEncode;

@SpringBootApplication
public class MandalaResidencesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MandalaResidencesApplication.class, args);
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new PasswordEncode();
	}
}
