package com.test2;

public class Employee {
	double sal;
	double bonus;
	
	void calculateTotalPay(){
		double totalPay = sal + bonus;
		System.out.println("Total Pay : " + totalPay);
	}
}
