package com.test1;

public class Person {
	
}

class ObjectLifeCycle1{
	Person person;
	
	static class Exam{
		String name ;
		public void setName(String newName){
			name = newName;
		}
	}
		
	public void myMethod(){
		int num = 88;
		if(num == 0){
			return;
		}
		else if(num>70){
			Exam myExam1 = new Exam();
			myExam1.setName("And");
		}
		else {
			Exam myExam2 = new Exam();
			myExam2.setName("OR");
		}
	}
	
	public static void main(String[]args){
		Exam myExam = new Exam();
		myExam.setName("OCA Exam 1");
		myExam = null;
		myExam = new Exam();
		myExam.setName("Oracle");
	}
}

class ObjectLifeCycle2{
	Person person =  new Person();
	
	String model;
	
	void setModel(String val){
		model = val;
	}
	
	void printModel(String val){
		System.out.println(val);
	}
	
	String todaysDate(){
		return model;	
	}
}

class ObjectLifeCycle3{
	String str = "Guru";
	String str1 = new String("Guru");
	
	ObjectLifeCycle3(){
		new Person();
	}
	
	class Employee{
		public int daysOfwork(int days[]){
			int daysOff = 0;
			for(int i=0;i<days.length; i++){
				daysOff += days[i];				
			}
			return daysOff;
		}
	}
}
