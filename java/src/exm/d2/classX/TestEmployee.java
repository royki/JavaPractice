package exm.d2.classX;


public class TestEmployee {

	public static void main(String[] args) {

		//Object: Copy/Instance of a class	
		Employee A = new Employee();
		A.salary = 10000;	
		A.bonus = 500;	
		System.out.println("A");
		A.calculateTotalPay();
		A.calculateBonus();
		
		Employee B, C, D;
		B = new Employee();
		C = new Employee();
		D = new Employee();
		
		B.salary = 9999;
		B.bonus = 600;
		System.out.println("B");
		B.calculateTotalPay();
		B.calculateBonus();
		
		C.salary = 12000;
		C.bonus = 400;
		System.out.println("C");
		C.calculateTotalPay();
		C.calculateBonus();
		
		D.salary = 10000;
		D.bonus = 550;
		System.out.println("D");
		D.calculateTotalPay();
		D.calculateBonus();
	}

}
