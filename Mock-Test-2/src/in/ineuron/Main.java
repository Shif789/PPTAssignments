package in.ineuron;

import in.ineuron.q1.Animal;
import in.ineuron.q1.Dog;
import in.ineuron.q2.Circle;
import in.ineuron.q2.Rectangle;
import in.ineuron.q2.ShapeCalculator;
import in.ineuron.q2.Triangle;
import in.ineuron.q3.Person;

public class Main {

	public static void main(String[] args) {
		//quesiton1
		Animal dog = new Dog();
		dog.makeSound();
		
		/// question2
		System.out.println();
		ShapeCalculator shapeCalculator = new ShapeCalculator();
		shapeCalculator.printArea(new Rectangle());
		shapeCalculator.printArea(new Circle());
		shapeCalculator.printArea(new Triangle());
		
		// question 3
		System.out.println();
		Person person = new Person();
		person.setName("Shefat Hossain");
		person.setAge(26);
		person.setAddress("Dhaka, Bangladesh");
		
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getAddress());
		
		// question 4
		System.out.println();
		in.ineuron.q4.Drawable rectangle = new in.ineuron.q4.Rectangle();
		rectangle.draw(5, 4);
		in.ineuron.q4.Drawable circle = new in.ineuron.q4.Circle();
		circle.draw(4, 4);

	}

}
