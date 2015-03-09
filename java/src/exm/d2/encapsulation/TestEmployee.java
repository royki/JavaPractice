package exm.d2.encapsulation;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setSalary(6000);
		emp.setBonus(60);
		System.out.println("Salary "+emp.getSalary());
		System.out.println("Bonus "+emp.getBonus());
		emp.calTotalPay();
		
		/*Employee emp1 = new Employee();
		emp1.setSalary(60000);
		emp1.bonus = 500;
		emp1.calTotalPay();*/
	}

}
