package exm.d2.polymorphism;

public class TestBox {

	public static void main(String[] args) {
		Box b1 = new Box();
		b1.calculateArea(4);
		b1.calculateArea(3.2);
		b1.calculateArea(3, 4);

	}

}
