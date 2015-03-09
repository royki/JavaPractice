package com.test1;

class Emp{
	private String name;
	private double no;
	
	public void setNum(double num){
		if(num > 0 && num <= 99)
			no = num;	
	}
	
	public double getNum(){
		return no;
	}
	
	public void setName(String val){
		name = val;
	}

	public String getName(){
		return name;
	}
	public int daysOfWeek(int... days){
		int daysOff = 0;
		for(int i = 0; i<days.length ;i++){
			daysOff += days[i];			
		}				
		return daysOff;
	}
}

class myTest {
	
	int myNum(int num1, int num2){
		int max = 80;
		if(num1 == 0 && num2 == 0){
			return num1;
		}else if(num1 > max && num2 < max ){
			num1 +=max;
		}	
		return num1;
	}
	
	int myNum(int num1, String str1){
		return num1;
		
	}

}

public class Test {
	
	int c;
	Test(){
		int a = 10;
		int b = 20;
		c = a+b;
		System.out.println(c);		
	}	
	public static void main(String[]args){
		myTest No = new myTest();			
		System.out.println(No.myNum(81, 9));
		
		Emp emp = new Emp();	
		emp.setName("Roy");
		System.out.println(emp.daysOfWeek(9));
		System.out.println(emp.getName());
		//Test t = new Test();
		
		emp.setNum(99.0);
		System.out.println(emp.getNum());
	}	
}
