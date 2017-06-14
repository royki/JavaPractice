package com.series;

import java.util.Scanner;

public class Loop {

	public static int whileLoop(int x) {
		int a = 0;
		while (a < x) {
			System.out.println(x);
			x++;
		}
		return x;
	}

	public static int forLoop(int x) {
		for (int i = 10; i > x; i--) {
			System.out.println("For Loop : " + i);
		}
		return x;
	}

	public static int doWhileLoop(int x) {
		int a = 0;
		do {
			System.out.println(a);
			a++;
		} while (a < x);
		return x;
	}

	public static void nestedForLoop1(int x) {

		for (int i = 0; i < x; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void nestedForLoop2(int x, int k) {
		// k = 1;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print("* ");
			}
			k += 2;
			System.out.println();
		}
	}

	public static void nestedForLoop3(int x, int k) {

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print(" ");
			}
			k -= 2;
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void nestedForLoop4(int x, int num) {
		for (int i = 0; i < x; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println(" ");
		}
	}

	public static void nestedForLoop5(int x, int num) {
		for (int i = 0; i < x; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(num + " ");
			}
			num++;
			System.out.println(" ");
		}
	}

	public static void nestedForLoop6(int x) {
		for (int i = 0; i < x; i++) {
			int num = 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println(" ");
		}
	}

	public static void nestedForLoop7(int row) {
		int k = 0;
		for (int i = 1; i <= row; i++) {
			for (int space = 1; space <= (row - i); space++) {
				System.out.print("  ");
			}
			while (k != (2 * i - 1)) {
				System.out.print("* ");
				k++;
			}
			k = 0;
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// System.out.println("Enter number ");
		// Scanner sc = new Scanner(System.in);
		// int input = sc.nextInt();
		// whileLoop(10);
		// forLoop(input);
		// doWhileLoop(10);
		// nestedForLoop2(5,1);
		// nestedForLoop3(5, 8);
		// nestedForLoop4(5, 0);
		// nestedForLoop6(5);
		nestedForLoop7(9);
	}
}
