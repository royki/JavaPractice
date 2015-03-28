package exm.d2.method;

public class Box {
	int length;
	int width;

	int calculateArea(int length, int width) {

		// To access the class lable variable use 'this' keyword; 		
		// if the method parameter has the same variable name.

		int area = this.length * this.width;
		System.out.println("Area " + area);
		return area;
	}
}
