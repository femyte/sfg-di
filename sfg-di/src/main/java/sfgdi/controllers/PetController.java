package sfgdi.controllers;

import org.fortress.di.PetServiceFactory;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {
	
	private final PetServiceFactory petServiceFactory;

	public PetController(PetServiceFactory petServiceFactory) {
		this.petServiceFactory=petServiceFactory;
		// TODO Auto-generated constructor stub
	}
	
	public String whichPetIsTheBest() {

		return petServiceFactory.getPetService("cat").getPetType();
	}

}
