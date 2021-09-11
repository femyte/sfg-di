package sfgdi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sfgdi.others.ToyBuilder;
import sfgdi.others.ToyCar;
import sfgdi.others.ToyHouse;
import sfgdi.others.ToyPlane;

class ToyBuilderTest {
	
	ToyHouse toyHouse;
	ToyCar toyCar;
	ToyPlane toyPlane;

	@BeforeEach
	void setUp() throws Exception {
		
		toyHouse = ToyBuilder.buildToyHouse();
		toyCar = ToyBuilder.buildToyCar();
		toyPlane = ToyBuilder.buildToyPlane();
	}

	@Test
	void testBuildToyHouse() {
		System.out.println(toyHouse);
	}

	@Test
	void testBuildToyCar() {
		toyCar.move();
		System.out.println(toyCar);
	}

	@Test
	void testBuildToyPlane() {
		toyPlane.move();
		toyPlane.fly();
		System.out.println(toyPlane);
	}

}
