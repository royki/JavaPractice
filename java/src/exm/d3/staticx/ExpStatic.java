package exm.d3.staticx;

//static is one per class,not one per object

public class ExpStatic {
	//static data
	static int staticvar;
	int nonstaticvar;
	
	//static method
	static public void staticMethod() {
		System.out.println("Static variable = " +staticvar);
		staticvar++;
	}
	
	public void nonStaticMethod() {
		System.out.println("NonStatic variable = " +nonstaticvar);
		nonstaticvar++;
	}
	
	static {
		System.out.println("Static block of code");
	}
	
	ExpStatic() {
		System.out.println("Constructor");		
	}
}
