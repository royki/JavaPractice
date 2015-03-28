package exm.d2.constructor;

public class BoxConstructor {
	int length;
	int width;	
	//double width;
	
	// Constructor is a method that has the same name as the 
	// class. It is executed when an object is created.
	// It is used to set default values and doesn't have any return type.	
	
	// 1st constructor - no argument
	public BoxConstructor() {				
		this.length = 5;
		this.width = 4;
		System.out.println("Constructor1 Fired");
	}
	// 2nd constructor - 2 arguments. 
	//Constructor can have same name, but they are differentiate by the type and number of arguments
	public BoxConstructor(int length, int width) {				
		this.length = length;
		this.width = width;
		System.out.println("Constructor2 Fired");
	}
	
	/*public BoxConstructor(int length, double width) {				
		this.length = length;
		this.width = width;
		System.out.println("Constructor2 Fired");
	}*/
	
	void calculateArea(){
		System.out.println("Area = " + (this.length*this.width));
	}
}
