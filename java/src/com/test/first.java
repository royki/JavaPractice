package com.test;

import java.lang.reflect.Array;

public class first {
	
	public static void main(String[] args) {
		
//		System.out.println(args[0]);
//		System.out.println(args[1]);

		/*int x = 11;
		int y = 11;
		
		int z = x+y;
		
		System.out.println("Addition of x and y:" + z);
		
		if(x < y){
			System.out.println(" x < y");
			z = y -x;
			System.out.println(" y-x :" + z);
		}else if (x > y){
			System.out.println("x > y");
			z = x - y;
			System.out.println(" x -y :" + z);
		}else if (x == y){
			System.out.println("x == y");
			int a = 0;
			if (a == (x-y)){
				System.out.println("x:" + x + " AND y: " + y);
			}
		}
		*/
		/*int j = 10;
		switch (j) {
			case 0:
				System.out.println("Value 0");			
				break;
			case 1:
				System.out.println("Value 1");
				break;
			case 2:
				System.out.println("Value 2");
				break;
			case 3:
				System.out.println("Value 3");
			default:
				System.out.println("lol");
			break;
		}
		*/
		int[] arr = {10, 30, 40, 14, 65};
		
		System.out.println(arr.length);
		System.out.println(arr[2]);
		
		for(int i: arr){
			System.out.print(i + "|");
		}
		
		
		System.out.println("");
		System.out.println("-------------");
		String[] str = new String[5];
		str[0] = "Kyran";
		str[1] = "Roi";
		
		for(String temp: str){
			System.out.print(temp + "|");
		}
		System.out.println();
		System.out.println("-------------");
		
		String age = "32";
		String salary = "4321";
		
		System.out.println(str[1].toUpperCase() +"-"+str[0].toLowerCase());
		int a =  Integer.parseInt(age);
		double b = Double.parseDouble(salary);
		
		System.out.println(a + b);
/*		// String to split.
		String str = "I want to participate in HP";
		String delims = "[ ]+";

		// given string will be split by the argument delimiter provided.
		String[] tokens = str.split(delims);

		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}
		
		  String str = "one-two-three"; String[] temp;
		  
		  delimiter String delimiter = "-"; given string will be split by the
		  argument delimiter provided. temp = str.split(delimiter); print
		  substrings for(int i =0; i < temp.length ; i++)
		  System.out.println(temp[i]);
*/		 
	}
}


