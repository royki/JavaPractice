package com.test4;
class ColorPack {
	 int shadeCount = 12;

	int getShadeCount() {
		return shadeCount;
	}
}

class Artist {
	public static void main(String args[]) {
		ColorPack pack1 = new ColorPack();
		System.out.println(pack1.getShadeCount());
	}
}