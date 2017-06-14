package com.dictionary;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {

	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> phoneDict = new HashMap<>();
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			String name = sc.next();
			int phone = sc.nextInt();
			phoneDict.put(name, phone);
			sc.nextLine();
		}

		while (sc.hasNext()) {
			String name = sc.nextLine();
			if (phoneDict.containsKey(name)) {
				System.out.println(name  + "=" + phoneDict.get(name));
			} else {
				System.out.println("Not found");
			}

		}

	}
}
