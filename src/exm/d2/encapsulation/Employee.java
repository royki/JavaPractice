package exm.d2.encapsulation;

// Encapsulation act on the data and methods  
// Data hiding / protect data from accidental use

public class Employee {
	// private - access modifier
	private double salary;
	private double bonus;

	public double getSalary() {
		return salary;
	}

	public double setSalary(double salary) {

		if (salary >= 5000 && salary <= 8000) {
			this.salary = salary;
		} else {
			this.salary = 0;
			System.out.println("Please Check Salary");
		}
		return salary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	double calTotalPay() {
		double tp = salary + bonus;
		System.out.println("Total salary " + tp);
		return tp;
	}
}
