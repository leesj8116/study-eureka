package leesj8116.study.betaservice.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BetaController {
	@Value("${eureka.instance.instance-id}")
	private String instanceId;

	@GetMapping("check")
	public String beta() {
		return String.format("💻 %s : This is alpha", instanceId);
	}
}
