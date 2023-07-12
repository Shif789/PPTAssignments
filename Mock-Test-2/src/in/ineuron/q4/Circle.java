package in.ineuron.q4;

public class Circle implements Drawable {

	private static double PI=3.1415;
	
	@Override
	public void draw(double length, double width) {
		double radius=length/2;
		System.out.println("Area of circle is: "+PI*radius*radius);
		
	}

	

}
