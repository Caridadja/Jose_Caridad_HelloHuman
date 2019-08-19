package com.caridadja.hellohuman;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {
	@RequestMapping("/")
	public String greet(@RequestParam(value="name", required=false) String search, @RequestParam(value="last_name", required=false) String last) {
		if(search != null && last != null) {
			return "Hello "+search+" "+last+"!";
		}
		else if(search != null && last == null) {
			return "Hello "+search+"!";
		}
		else {
			return "Hello Human!";
		}
	}
}
