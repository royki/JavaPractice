package exm.d3.inheritance;

//When a class acquires the properties of another class
//Base class/parent class/super class

public class Box {

	private int length;
	private int width;
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	

	public int calArea() {
		return length * width;
	}
}
