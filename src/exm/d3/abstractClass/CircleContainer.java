package exm.d3.abstractClass;

public class CircleContainer extends Container {
	
	@Override
	public double calAreaOfBase(int length) {
		double area = Math.PI*(length/2)*(length/2);
		return area;
	}

}
