package in.ineuron.q2;

public class ShapeCalculator {

	public void printArea(Shape shape) {
		double area = shape.calculateArea(5, 4);
		System.out.println("Shape is: "+shape.getClass().getName()+", Area is:"+area);
	}
}
