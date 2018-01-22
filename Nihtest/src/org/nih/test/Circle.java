package org.nih.test;
public class Circle implements Shape {
    private final double radius;
    final double pi = Math.PI;

    public Circle() {
        this(1);
    }   
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        // A = ? r^2
        return pi * Math.pow(radius, 2);
    }

    public double perimeter() {
        // P = 2?r
        return 2 * pi * radius;
    }
}