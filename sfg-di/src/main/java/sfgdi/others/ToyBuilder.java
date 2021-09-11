package sfgdi.others;

public class ToyBuilder {

	public ToyBuilder() {
		// TODO Auto-generated constructor stub
	}
	
	public static ToyHouse buildToyHouse() {
		
		ToyHouse toyHouse = new ToyHouse();
		toyHouse.setPrice(10.0);
		toyHouse.setColor("Yellow");
		return toyHouse;
		
	}
	
	public static ToyCar buildToyCar() {
		
		ToyCar toyCar = new ToyCar();
		toyCar.setPrice(15.0);
		toyCar.setColor("Blue");
		return toyCar;
	}
	
	public static ToyPlane buildToyPlane() {
		
		ToyPlane toyPlane = new ToyPlane();
		toyPlane.setPrice(20.0);
		toyPlane.setColor("White");
		return toyPlane;
	}

}
