package swd20.tuntitehtava2b.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping(value = "/hello")
	public String helloworld() {
		return "hello";
	}

}
