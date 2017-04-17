package com.series;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 1; i <= 10; i++) {
			int a = i * n;
			System.out.println(n + " x " + i + " = " + a);
		}
	}
}
