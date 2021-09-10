package sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import sfgdi.services.PetService;

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
