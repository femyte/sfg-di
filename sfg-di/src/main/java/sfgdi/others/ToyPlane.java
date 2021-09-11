package sfgdi.others;

public class ToyPlane implements Toy, Movable, Flyable {
	
	double price;
	String color;

	public ToyPlane() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("ToyPlane is now FLYING ...");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("ToyPlane is now MOVING ...");
		
	}

	@Override
	public void setPrice(double price) {
		// TODO Auto-generated method stub
		this.price = price;
		
	}

	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		this.color = color;
		
	}
	
	@Override
	public String toString() {
		
		return "ToyPlane : Toy Plane - Price : " + price + " Color : " + color;
	}
	
	

}
