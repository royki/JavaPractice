package exm.d2.polymorphism;

/*
 Overloading --
 Method with the same name differentiate by argument numbers and argument type
 Not return type of method
 */

public class Box {

	void calculateArea(int length) {
		System.out.println("Area " + length);
	}

	void calculateArea(double length) {
		System.out.println("Area " + length);
	}

	void calculateArea(int length, int width) {
		System.out.println("Area " + length * width);
	}

}
