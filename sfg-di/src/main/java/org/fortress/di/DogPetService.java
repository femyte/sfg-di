package org.fortress.di;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dog" , "default"})
@Service("serviceDogCat")
public class DogPetService implements PetService {

	public DogPetService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getPetType() {
		// TODO Auto-generated method stub
		return "Dogs are the Best";
	}

}
