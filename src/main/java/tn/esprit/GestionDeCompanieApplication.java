package tn.esprit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GestionDeCompanieApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionDeCompanieApplication.class, args);
	}

}
