package exm.d2.constructor;


public class BoxConstructorMain {

	public static void main(String[] args) {
		BoxConstructor Box = new BoxConstructor();
		Box.calculateArea();
		
		BoxConstructor Box1 = new BoxConstructor();
		Box1.length = 10;
		Box1.width = 5;
		Box1.calculateArea();

		BoxConstructor Box2 = new BoxConstructor(3,5);
		Box2.calculateArea();
	}

}
