package pe.com.foxdev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiOrdersApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiOrdersApplication.class, args);
	}

}
