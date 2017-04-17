package com.recursion;

import java.util.Scanner;

public class Recursion {

	public static int Summation(int x) {
		// Base case
		if (x <= 0) {
			return 0;
		}
		// Recursion case: Keep going
		else {
			return x + Summation(x - 1);
		}
	}

	public static long Factorial(long n) {
		// Base case
		if (n <= 1) {
			return 1;
		}
		// Recursion case
		else {
			return n * Factorial(n - 1);
		}
	}

	public static long Exponention(int n, int p) {
//		Base  case
		if(p<=0) {
			return 1;
		}
//		Recursion case
		else {
			return n * Exponention(n, p-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number n : ");
		int n = sc.nextInt();
		System.out.print("Enter a number p : ");
		int p = sc.nextInt();
		System.out.println("Summation of recusrion " + n + " : " + Summation(n));
		System.out.println("Factorial " + n+"!" + " : " + Factorial(n));
		System.out.println("Exponentiation " + n + " : " + Exponention(n, p));
	}
}
