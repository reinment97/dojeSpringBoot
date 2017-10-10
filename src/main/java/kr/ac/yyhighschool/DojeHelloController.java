package kr.ac.yyhighschool;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojeHelloController {
	
	@RequestMapping("/")
	public String index() {
		return "Hello Doje";
	}
}
