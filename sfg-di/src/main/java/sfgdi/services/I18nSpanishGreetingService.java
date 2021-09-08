package sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES" , "default"})
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService {

	public I18nSpanishGreetingService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello World -ES ";
	}

}
