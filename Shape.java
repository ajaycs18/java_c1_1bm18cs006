/*
Develop a Java program to create an abstract class named Shape that contains two integers and an empty method named printArea( ). 
Provide three classes named Rectangle, Triangle and Circle such that each one of the classes extends the class Shape. 
Each one of the classes contain only the method printArea( ) that prints the area of the given shape.
*/

import java.util.Scanner;

abstract class Shape {
	int length, breadth;
	abstract void printArea();
}

class Rectangle extends Shape {
	Rectangle() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter length: ");
		length = in.nextInt();
		System.out.print("Enter breadth: ");
		breadth = in.nextInt();
	}
	
	void printArea() {
		System.out.println("Area of Rectangle: " + length * breadth);
	}
}

class Triangle extends Shape {
	Triangle() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Height: ");
		length = in.nextInt();
		System.out.print("Enter Base: ");
		breadth = in.nextInt();
	}

	void printArea() {
		System.out.println("Area of Triangle: " + length * breadth * 0.5); // 1/2 * base * height
	}
}	

class Circle extends Shape {
	Circle() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Radius: ");
		length = in.nextInt();
	}

	void printArea() {
		System.out.println("Area of Circle: " + Math.PI * Math.pow(length, 2));
	}
}

class ShapeDemo {
	public static void main(String[] args) {
		System.out.println("Enter Shape you want to create: ");
		System.out.println("1. Rectangle");
		System.out.println("2. Triangle");
		System.out.println("3. Circle");

		int choice = (new Scanner(System.in)).nextInt();
		Shape obj = null;

		if (choice == 1) obj = new Rectangle();
		else if (choice == 2) obj = new Triangle();
		else if (choice == 3) obj = new Circle();

		obj.printArea();
	}
}
