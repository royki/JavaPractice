package exm.d3.inheritance;

//child class/inherited class/subclass

public class NewBox extends Box {

	private int height;

	public void setHeigth(int height) {
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public int calVol() {
		return getLength() * getWidth() * getHeight();
	}

	/*
	 * Overriding When a method in the class and in the subclass has the same
	 * signature as a method in the super class, then subclass method takes
	 * precedence
	 */

	public int calArea(int length) {
		return length * height;
	}
}
