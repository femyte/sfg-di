package sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import sfgdi.services.GreetingService;

@Controller
public class ConstructorInjectedController {
	
	private final GreetingService greetingService;

	public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingService") GreetingService greetingService) {
		this.greetingService = greetingService;
		// TODO Auto-generated constructor stub
	}
	
	public String getGreeting() {
		
		return greetingService.sayGreeting();
	}

}
