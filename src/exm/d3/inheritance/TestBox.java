package exm.d3.inheritance;

public class TestBox {

	public static void main(String[] args) {

		Box B1 = new Box();
		B1.setLength(10);
		B1.setWidth(6);
		int area1 = B1.calArea();

		Box B2 = new Box();
		B2.setLength(9);
		B2.setWidth(7);
		int area2 = B2.calArea();

		NewBox B3 = new NewBox();
		B3.setLength(5);
		B3.setWidth(6);
		B3.setHeigth(8);
		int a = B3.calArea();
		int a1 = B3.calArea(4);
		int v = B3.calVol();
		int newArea = B3.calArea();

		System.out.println("Area of B1 " + area1);
		System.out.println("Area of B2 " + area2);
		System.out.println("Area of B3 " + a);
		System.out.println("Area of B3 with constructor argument " + a1);
		System.out.println("Area of newArea " + newArea);
		System.out.println("Vol of B3 " + v);
	}

}
