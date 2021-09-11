package sfgdi.others;

public class ToyCar implements Toy, Movable{
	
	double price;
	String color;

	public ToyCar() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("ToyCar is now Moving ........");
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
		
		return "ToyCar : Toy Car - Price : " + price + " Color : " + color;
	}
	
	

}
