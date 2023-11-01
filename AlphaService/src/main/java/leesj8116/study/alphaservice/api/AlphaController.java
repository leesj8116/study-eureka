package leesj8116.study.alphaservice.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlphaController {

	@Value("${eureka.instance.instance-id}")
	private String instanceId;

	@GetMapping("check")
	public String alpha() {
		return String.format("💻 %s : This is alpha", instanceId);
	}
}
