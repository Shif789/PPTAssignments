package in.ineuron.q2;

public class Circle extends Shape {

	private static final double PI=3.1415;
	
	@Override
	public double calculateArea(double length, double width) {
		double radius=length/2;
		return PI*radius*radius;
	}

	
}
