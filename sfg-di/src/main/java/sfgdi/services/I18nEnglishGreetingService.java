package sfgdi.services;

import sfgdi.repositories.EnglishGreetingRepository;

public class I18nEnglishGreetingService implements GreetingService  {
	
	private final EnglishGreetingRepository englishGreetingRepository;

	public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
		this.englishGreetingRepository = englishGreetingRepository;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return englishGreetingRepository.getGreeting();
	}

}
