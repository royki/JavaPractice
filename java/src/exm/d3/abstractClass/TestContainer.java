package exm.d3.abstractClass;

public class TestContainer {

	public static void main(String[] args) {
	
		Container C1 = new SquareContainer();
		C1.calVol(4, 5);
		Container C2 = new CircleContainer();
		C2.calVol(4, 5);
		
		Container C3 = new SquareContainer();
		C3.calVol(5, 4);
		C3 = new CircleContainer();
		C3.calVol(5, 4);
		
	}
}
