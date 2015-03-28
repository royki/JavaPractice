package exm.d3.staticx;

public class TestExmpStatic {

	/*
	 * static block of code is fired even before the constructor is fired.
	 * whenever an object is created, constructor is fired but even before of
	 * that static method/variable is fired.
	 * 
	 * static block of code is fired only once.
	 */
	public static void main(String[] args) {
		ExpStatic obj1 = new ExpStatic();
		System.out.println("Object -------------> 1");
		obj1.staticMethod();
		obj1.nonStaticMethod();
		obj1.nonStaticMethod();

		/*
		 * we can call static data or static method using the class name
		 * directly
		 */
		ExpStatic.staticMethod();

		System.out.println("Object -------------> 2");
		ExpStatic obj2 = new ExpStatic();
		obj2.staticMethod();
		obj2.staticMethod();
		obj2.nonStaticMethod();
		obj2.nonStaticMethod();
	}

}
