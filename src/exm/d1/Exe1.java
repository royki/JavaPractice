package exm.d1;

public class Exe1 {

	public static void main(String[] args) {
		double salary = 78678.87;
		double tax = 0.0;

		if (salary <= 15000) {
			tax = salary * 0.10;
		} else if (salary <= 40000) {
			tax = salary * 15;
		} else {
			tax = salary * 20;
		}
		System.out.println("Tax = " + tax);
	}

}
