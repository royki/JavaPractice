package com.test2;

public class test {

	public static void main(String [] args){	
	
		String[] num = {"10", "20", "30", "40", "50"};
		int total = 0;
		
		for(String temp: num){
			total += Integer.parseInt(temp);
		}
		System.out.println("Total :" + total);
	}		
}
