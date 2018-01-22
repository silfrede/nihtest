package org.nih.test;
/* 
 * 
 *Given the following abstract class:
 *
 *  public abstract class Shape {
 *      public abstract double area();
 *      public abstract double perimeter();
 *  }
 *
 * Implement a Circle, Triangle, and Rectangle class which extend the class Shape.
 * Ex: public class Circle extends Shape ... etc
 */

public interface Shape {
	public double area();

	public double perimeter();
}