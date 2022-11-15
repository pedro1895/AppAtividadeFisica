package br.edu.infnet.appatividadefisica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppatividadefisicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppatividadefisicaApplication.class, args);
	}

}
