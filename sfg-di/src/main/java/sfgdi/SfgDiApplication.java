package sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;

import sfgdi.controllers.ConstructorInjectedController;
import sfgdi.controllers.I18nController;
import sfgdi.controllers.MyController;
import sfgdi.controllers.PetController;
import sfgdi.controllers.PropertyInjectedController;
import sfgdi.controllers.SetterInjectedController;


@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		
		System.out.println("--- THE BEST PET IS ---");
		PetController petController = (PetController) ctx.getBean("petController");
		System.out.println(petController.whichPetIsTheBest());
		
		System.out.println("--------GREETING INTERNATIONALIZATION : ");
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());
		
		System.out.println("--------FROM PRIMARY : ");
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.sayHello());
		
		System.out.println("--------BY PROPERTY :");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
		
		System.out.println("---------BY SETTER :  ");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());
		
		System.out.println("---------BY CONSTRUCTOR : ");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
		

	}

}
