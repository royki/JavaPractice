package com.series;

import java.util.Scanner;

public class CharSolution {

	public static String separatorString(String str) {
		String even = "";
		String odd = "";
		for(int i = 0; i < str.length(); i++) {
			if(i%2 == 0) {
				even += str.charAt(i);
			} else {
				odd += str.charAt(i);
			}
		}
		return even+" "+odd;
	}
	
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.nextLine();
		String str1[] = new String[input];
		if ((input >= 1 && input <= 10)) {
			for (int i = 0; i < input; i++) {
				str1[i] = sc.nextLine();
				if (str1[i].length() >= 2 && str1[i].length() <= 10000) {
					System.out.println(separatorString(str1[i]));
				}
			}
		}
	}
}