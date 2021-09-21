package org.fortress.di;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("cat")
@Service("serviceDogCat")
public class CatPetService implements PetService {

	public CatPetService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getPetType() {
		// TODO Auto-generated method stub
		return "Cat are the Best";
	}

}
