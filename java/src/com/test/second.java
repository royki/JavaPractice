package com.test;

public class second {
	int phoneNum;
	
	void setNumber(int i){
		this.phoneNum = i;
	}
	
	int getNumber(){
		return phoneNum;
	}
	
	static class TestPhone{
		public static void main(String[] args){
			second P = new second();
			P.setNumber(9989);
			System.out.println(P.phoneNum);
		}
	}
}

