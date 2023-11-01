package leesj8116.study.betaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BetaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BetaServiceApplication.class, args);
	}

}
