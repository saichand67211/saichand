package com.zensar.springbootcoupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "test", "com.zensar" })
public class SpringBootCouponApplication {

	public static void main(String... args) {
		System.out.println("sai");
		SpringApplication.run(SpringBootCouponApplication.class, args);

		System.out.println("chand");

	}

}
