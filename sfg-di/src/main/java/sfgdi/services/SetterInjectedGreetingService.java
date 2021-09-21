package sfgdi.services;

public class SetterInjectedGreetingService implements GreetingService {

	public SetterInjectedGreetingService() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String sayGreeting() {
		return "Hello World- Setter";
	}

}
