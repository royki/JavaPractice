package com.test4;
class OpPre {
	public static void main(String... args) {
		int x = 10;
		int y = 20;
		int z = 30;
		System.out.println(x + y % z);
		if (x + y % z > (x + (-y) * (-z))) {
			System.out.println(x + y + z);
		}
	}	
}