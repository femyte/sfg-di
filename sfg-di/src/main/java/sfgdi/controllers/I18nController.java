package sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import sfgdi.services.GreetingService;

@Controller
public class I18nController {
	
	private final GreetingService greetingService;

	public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
		this.greetingService = greetingService;
		// TODO Auto-generated constructor stub
	}
	
	public String sayHello() {
		
		return greetingService.sayGreeting();
	}

}
