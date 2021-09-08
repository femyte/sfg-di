package sfgdi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sfgdi.controllers.ConstructorInjectedController;
import sfgdi.services.ConstructorInjectedGreetingService;

class ConstructorInjectedControllerTest {
	
	ConstructorInjectedController constructorInjectedController;

	@BeforeEach
	void setUp() throws Exception {
		
		constructorInjectedController = new ConstructorInjectedController(new ConstructorInjectedGreetingService());
		
	}

	@Test
	void testGetGreeting() {
		System.out.println(constructorInjectedController.getGreeting());
	}

}
