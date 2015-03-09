package exm.d3.superx;

public class SubBox extends Box {
	
	public void calVol(int length, int width, int heigth) {
		double volume = super.calArea(length, width)* heigth;
		System.out.println("Volume = "+ volume);
	}
}
