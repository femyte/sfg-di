package sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import sfgdi.services.GreetingService;

@Controller
public class PropertyInjectedController {
	
	@Qualifier("propertyInjectedGreetingService")
	@Autowired
	public GreetingService greetingService;

	public PropertyInjectedController() {
		// TODO Auto-generated constructor stub
	}
	
	public String getGreeting() {
		
		return greetingService.sayGreeting();
	}

}
