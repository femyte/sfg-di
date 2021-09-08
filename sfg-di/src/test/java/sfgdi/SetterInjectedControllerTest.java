package sfgdi;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sfgdi.controllers.SetterInjectedController;
import sfgdi.services.SetterInjectedGreetingService;

class SetterInjectedControllerTest {
	
	SetterInjectedController setterInjectedController;

	@BeforeEach
	void setUp() throws Exception {
		
		setterInjectedController = new SetterInjectedController();
		setterInjectedController.setGreetingService(new SetterInjectedGreetingService());
	}

	@Test
	void testGetGreetings() {
		System.out.println(setterInjectedController.getGreeting());
	}

}
