package exm.d3.abstractClass;

public class SquareContainer extends Container{

	@Override
	public double calAreaOfBase(int length) {
		double area = length*length;
		return area;
	}

}
