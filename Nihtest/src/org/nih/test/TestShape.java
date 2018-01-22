package org.nih.test;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class TestShape {
	public static void main(String[] args) {

		// creating arraylist
		ArrayList<Shape> list = new ArrayList<Shape>();

		Map<String, Shape> map = new TreeMap<String, Shape>();

		// Rectangle test
		double width = 5, length = 7;
		Shape rectangle = new Rectangle(width, length);
		System.out.println("Rectangle width: " + width + " and length: " + length + "\nResulting area: "
				+ rectangle.area() + "\nResulting perimeter: " + rectangle.perimeter() + "\n");

		// Circle test
		double radius = 5;
		Shape circle = new Circle(radius);
		System.out.println("Circle radius: " + radius + "\nResulting Area: " + circle.area() + "\nResulting Perimeter: "
				+ circle.perimeter() + "\n");

		// Triangle test
		double a = 5, b = 3, c = 4;
		Shape triangle = new Triangle(a, b, c);
		System.out.println("Triangle sides lengths: " + a + ", " + b + ", " + c + "\nResulting Area: " + triangle.area()
				+ "\nResulting Perimeter: " + triangle.perimeter() + "\n");
/*
		// adding Shapes to the ArrayList
		list.add(rectangle);
		list.add(circle);
		list.add(triangle);*/

		// Adding Books to map
		map.put("Rectangle", rectangle);
		map.put("Circle", circle);
		map.put("Triangle", triangle);

		/*// Getting list using for each loop
		for (Shape s : list) {
			System.out.println(s.area());

		}
*/
		// Traversing map
		for (Map.Entry<String, Shape> entry : map.entrySet()) {
			String key = entry.getKey();
			Shape b1 = entry.getValue();
			System.out.println(key + " Area:");
			System.out.println(b1.area());

		}

	}
}