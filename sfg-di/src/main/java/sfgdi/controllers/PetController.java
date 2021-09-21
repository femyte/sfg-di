package sfgdi.controllers;

import org.fortress.di.PetService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {
	
	private final PetService petService;

	public PetController(@Qualifier("serviceDogCat") PetService petService) {
		this.petService = petService;
		// TODO Auto-generated constructor stub
	}
	
	public String whichPetIsTheBest() {
		
		return petService.getPetType();
	}

}
