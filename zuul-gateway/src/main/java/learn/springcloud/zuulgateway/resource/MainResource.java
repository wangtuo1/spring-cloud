package learn.springcloud.zuulgateway.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainResource {
	@GetMapping("/")
	public String root() {
		return "Hello World!";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "Hello World! admin";	
	}
	
	@GetMapping("/test")
	public String test() {
		return "Hello World! test";	
	}
}
