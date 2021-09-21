package sfgdi.services;


public class PropertyInjectedGreetingService implements GreetingService {

	public PropertyInjectedGreetingService() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String sayGreeting() {
		return "Hello World- Property";
	}

}
