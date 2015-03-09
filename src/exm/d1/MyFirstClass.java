package exm.d1;

public class MyFirstClass {

	public static void main(String[] args) {
		System.out.println("Hello World !!!");

		/*int x = 10;
		int y = 20;
		int result = x + y;
		System.out.println("Result = " + result);*/
//----------------------------------------------------------------
		/*if (x < y) {
			System.out.println("X is less than Y");
		} else if (x == y) {
			System.out.println("X is equal to Y");
		} else {
			System.out.println("X is greater than Y");
		}*/
//----------------------------------------------------------------
		/*for (int i = 10; i > 0; i--) {
			System.out.print("i = " + i);
		}
		System.out.println("");*/
//----------------------------------------------------------------		
		/*int n = -10;
		while (n <= 0) {
			System.out.print("n = " + n);
			n++;
		}
		System.out.println("");*/
//----------------------------------------------------------------		
		/*int p = 10;
		do {
			System.out.print("p = " + p);
			p--;
		} while (p > 0);*/
//----------------------------------------------------------------		
		/*int x = -10, y = 10;
		if (x > 0 && y > 0) {
			System.out.println("Both nums are +ve");
		} else if (x > 0 || y > 0) {
			System.out.println("One num is +ve");
		} else {
			System.out.println("Both nums are -ve");
		}*/
//----------------------------------------------------------------
		int j = 2;
		switch(j) {
		case 0:
			System.out.println("value is 0");
			break;
		case 1:	
			System.out.println("value is 1");
			break;
		case 2:
			System.out.println("value is 2");
			break;
		case 3:
			System.out.println("value is 3");
			break;
		default:
			System.out.println("No Value");
		}
//----------------------------------------------------------------		
	}
}
