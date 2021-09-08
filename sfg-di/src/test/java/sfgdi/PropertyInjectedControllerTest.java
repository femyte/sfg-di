package sfgdi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sfgdi.controllers.PropertyInjectedController;
import sfgdi.services.PropertyInjectedGreetingService;

class PropertyInjectedControllerTest {
	
	PropertyInjectedController propertyInjectedController;

	@BeforeEach
	void setUp() throws Exception {
		
		propertyInjectedController = new PropertyInjectedController();
		
		propertyInjectedController.greetingService = new PropertyInjectedGreetingService();
	}

	@Test
	void testGetGreetings() {
		System.out.println(propertyInjectedController.getGreeting());
	}

}
