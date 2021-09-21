package sfgdi.services;

public class ConstructorInjectedGreetingService implements GreetingService {

	public ConstructorInjectedGreetingService() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String sayGreeting() {
		 
		return " Hello World- Constructor ";
	}

}
