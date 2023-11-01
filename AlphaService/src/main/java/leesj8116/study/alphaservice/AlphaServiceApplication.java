package leesj8116.study.alphaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AlphaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlphaServiceApplication.class, args);
	}

}
