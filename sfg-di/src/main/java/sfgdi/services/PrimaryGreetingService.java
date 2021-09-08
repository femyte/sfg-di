package sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {

	public PrimaryGreetingService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello World - FROM PRIMARY";
	}

}
