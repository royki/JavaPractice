package com.test4;
class EString {
	public static void main(String args[]) {
		String eVal = "123456789";
		System.out.println(eVal.substring(eVal.indexOf("2"), eVal.indexOf("1"))
				.concat("0"));
	}
}