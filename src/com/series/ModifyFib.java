package com.series;

import java.util.Scanner;

public class ModifyFib {

	public static int modifyFib(int x) {
		if (x == 0 || x == 1) {
			return 1;
		} else {
			x = x + (x - 1) + (x - 2);
		}
		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		System.out.println(modifyFib(sc.nextInt()));

	}

}
