package sfgdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import sfgdi.services.ConstructorInjectedGreetingService;
import sfgdi.services.I18nEnglishGreetingService;
import sfgdi.services.I18nSpanishGreetingService;
import sfgdi.services.PrimaryGreetingService;
import sfgdi.services.PropertyInjectedGreetingService;
import sfgdi.services.SetterInjectedGreetingService;

@Configuration
public class GreetingServiceConfig {
	
	@Profile({"ES" , "default"})
	@Bean("i18nService")
	I18nSpanishGreetingService i18nSpanishGreetingService() {
		return new I18nSpanishGreetingService();
	}
	
	@Profile("EN")
	@Bean
	I18nEnglishGreetingService i18nService () {
		return new I18nEnglishGreetingService();
	}
	
	@Primary
	@Bean
	PrimaryGreetingService primaryGreetingService() {
		return new PrimaryGreetingService();
	}
	
	@Bean
	ConstructorInjectedGreetingService constructorInjectedGreetingService() {
		return new ConstructorInjectedGreetingService();
	}
	
	@Bean
	PropertyInjectedGreetingService propertyInjectedGreetingService() {
		return new PropertyInjectedGreetingService();
	}
	
	@Bean
	SetterInjectedGreetingService setterInjectedGreetingService() {
		return new SetterInjectedGreetingService();
	}

}
