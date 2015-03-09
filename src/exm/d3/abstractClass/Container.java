package exm.d3.abstractClass;

//Abstract class: Class which has empty methods and fully defined methods

public abstract class Container {

	public void calVol(int length, int heigth) {
		double vol = calAreaOfBase(length)* heigth;
		System.out.println("Volume "+ vol);
	}
	
	public abstract double calAreaOfBase(int length);
	
}
