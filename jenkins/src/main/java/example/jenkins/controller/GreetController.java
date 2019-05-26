package example.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

	@GetMapping("/hello")
	public String greet(@RequestParam(defaultValue="World") String name) {
		return "Hello "+name;
	}

}
