package exm.d3.inheritance;

//child class/inherited class/subclass

public class NewBox extends Box {

	private int heigth;
	
	
	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}

	public int calVol() {
		return getLength()*getWidth()*heigth;
	}
	
	/*
	 Overriding
	 When a method in the class and in the subclass has the same signature as a method
	 in the super class, then subclass method takes precedence 
	*/
	
	public int calArea(int length) {
		return length*heigth;
	}
}
