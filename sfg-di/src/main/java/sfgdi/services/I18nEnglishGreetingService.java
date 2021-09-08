package sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService  {

	public I18nEnglishGreetingService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello World - EN";
	}

}
