package sfgdi.others;

public class ToyHouse implements Toy {
	
	double price;
	String color;

	public ToyHouse() {
		// TODO Auto-generated constructor stub
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
		
		return " ToyHouse : Toy House- Price: " + price + " Color: " + color ;
	}

}
