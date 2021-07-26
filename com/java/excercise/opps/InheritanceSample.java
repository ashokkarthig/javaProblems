package com.java.excercise.oops;

/**
 * <h1>Shape</h1>
 * <p>
 * Shape class is a abstract class,which has declaration of three methods.
 * </p>
 * <p>
 * The class extends Shape should implement this methods
 * </p>
 * 
 * @author ASHOK G
 *
 */
abstract class Shape {
	abstract double getArea();

	abstract double getPerimeter();

	abstract void printDetails();
}

/**
 * <h1>Circle</h1>
 * <p>
 * Circle class extends Shape and provides implementation to abstract methods
 * </p>
 * <p>
 * This class provides the information such as area and Perimeter of Circle.
 * </p>
 * 
 * @author ASHOK G
 *
 */
class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	/**
	 * <h3>public double getArea()</h3>
	 * <p>
	 * this methods find and return the area of circle
	 * </p>
	 * 
	 * @return double
	 */
	public double getArea() {
		return 3.14 * radius * radius;
	}

	/**
	 * <h3>public double getPerimeter()</h3>
	 * <p>
	 * this methods find and return the perimeter of circle
	 * </p>
	 * 
	 * @return double
	 */
	public double getPerimeter() {
		return 2 * 3.14 * radius;
	}

	/**
	 * <h3>public void printDetails()</h3>
	 * <p>
	 * This method print the details of circle like radius,area and perimeter
	 * </p>
	 * 
	 * @return Nothing
	 */
	public void printDetails() {
		System.out.println("Radius    : " + radius);
		System.out.println("Area      : " + getArea());
		System.out.println("Perimeter : " + getPerimeter());
	}

}

/**
 * <h1>Square</h1>
 * <p>
 * Square class extends Shape and provides implementation to abstract methods
 * </p>
 * <p>
 * This class provides the information such as area and Perimeter of square.
 * </p>
 * 
 * @author ASHOK G
 *
 */
class Square extends Shape {
	private double side;

	public Square(double side) {
		this.side = side;
	}

	/**
	 * <h3>public double getArea()</h3>
	 * <p>
	 * this methods find and return the area of square
	 * </p>
	 * 
	 * @return double
	 */
	public double getArea() {
		return side * side;
	}

	/**
	 * <h3>public double getPerimeter()</h3>
	 * <p>
	 * this methods find and return the perimeter of square
	 * </p>
	 * 
	 * @return double
	 */
	public double getPerimeter() {
		return 4 * side;
	}

	/**
	 * <h3>public void printDetails()</h3>
	 * <p>
	 * This method print the details of square like side, area and perimeter
	 * </p>
	 * 
	 * @return Nothing
	 */
	public void printDetails() {
		System.out.println("length of Square    : " + side);
		System.out.println("Area of Square      : " + getArea());
		System.out.println("Perimeter of Square : " + getPerimeter());
	}

}

/**
 * <h1>Triangle</h1>
 * <p>
 * Triangle class extends Shape and provides implementation to abstract methods
 * </p>
 * <p>
 * This class provides the information such as area and Perimeter of traingle.
 * </p>
 * 
 * @author ASHOK G
 *
 */
class Traingle extends Shape {
	private double base;
	private double height;

	public Traingle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	/**
	 * <h3>public double getArea()</h3>
	 * <p>
	 * this methods find and return the area of triangle
	 * </p>
	 * 
	 * @return double
	 */
	public double getArea() {
		return (0.5) * (base * height);
	}

	/**
	 * <h3>public double getPerimeter()</h3>
	 * <p>
	 * this methods find and return the area of triangle
	 * </p>
	 * 
	 * @return double
	 */
	public double getPerimeter() {
		return 3 * base;
	}

	/**
	 * <h3>public void printDetails()</h3>
	 * <p>
	 * This method print the details of triangle like base, height, area and
	 * perimeter
	 * </p>
	 * 
	 * @return Nothing
	 */
	public void printDetails() {
		System.out.println("sides of Equilateral Traingle     : " + base);
		System.out.println("Area of Equilateral Traingle      : " + getArea());
		System.out.println("Perimeter of Equilateral Traingle : " + getPerimeter());
	}

}

public class InheritanceSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape circleShape = new Circle(20);
		System.out.println("\nCircle Details \n ");
		circleShape.printDetails();

		Shape squareShape = new Square(10);
		System.out.println("\nSquare Details \n ");
		squareShape.printDetails();

		Shape traingleShape = new Traingle(20, 15);
		System.out.println("\nEquilateral Traingle Details \n ");
		traingleShape.printDetails();

	}

}
