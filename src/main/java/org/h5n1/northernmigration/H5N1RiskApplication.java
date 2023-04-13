package org.h5n1.northernmigration;


import org.h5n1.northernmigration.service.H5N1RiskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


import java.util.Scanner;


@SpringBootApplication
public class H5N1RiskApplication {

	private final H5N1RiskService h5N1RiskService;

	@Autowired
	public H5N1RiskApplication(H5N1RiskService h5N1RiskService) {
		this.h5N1RiskService = h5N1RiskService;
	}

	public static void main(String[] args) {
		try {
			SpringApplication.run(H5N1RiskApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Bean
	public Scanner scanner() {
		return new Scanner(System.in);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplateBuilder().build();
	}

	@Bean
	public CommandLineRunner commandLineRunner(H5N1RiskService h5N1RiskService) {
		return args -> h5N1RiskService.run();
	}
}





