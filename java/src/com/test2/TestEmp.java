package com.test2;

public class TestEmp {
	
	public static void main(String [] args){
		
		/*employee A, B, C;		
		A = new employee();
		B = new employee();
		C= new employee();*/
		
		Employee A = new Employee();		
		A.bonus = 10000;
		A.sal = 6000;
		System.out.print("A ");
		A.calculateTotalPay();
		
		Employee B = new Employee();		
		B.bonus = 10000;
		B.sal = 8500;
		System.out.print("B ");
		B.calculateTotalPay();		
	}
}
