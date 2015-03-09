package exm.d2.classX;

//Class: Class has some data and methods.Template for object.

public class Employee {
	double salary; // class level data
	double bonus;

	void calculateTotalPay() {
		double totalPay = salary + bonus;
		System.out.println("Total Salary: " + totalPay);
	}

	void calculateBonus() {
		double totalBonus = salary * 0.05 + bonus;
		System.out.println("Total Bonus: " + totalBonus);
	}
}
