package com.series;

import java.util.Scanner;

public class DecimalToBinary {

	public static String toBinary(int n) {
		if (n == 0) {
			return "0";
		}
		String binary = "";
		while (n > 0) {
			int rem = n % 2;
			binary = rem + binary;
			n = n / 2;
		}
		return binary;
	}
	
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int decimal = scanner.nextInt();
		String binary = toBinary(decimal);
		System.out.println(binary);
		System.out.println(binary.replaceAll("(0|(?<!1)1(?!1))", "").length());
	}
}