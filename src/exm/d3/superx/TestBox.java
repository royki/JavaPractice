package exm.d3.superx;

public class TestBox {

	public static void main(String[] args) {
		
		Box B1 = new Box();
		B1.calArea(4, 5);
		
		SubBox B2 = new SubBox();
		//B2.calArea(5, 5);
		B2.calVol(7, 5, 6);

	}

}
