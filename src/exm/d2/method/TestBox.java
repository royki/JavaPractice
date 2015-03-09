package exm.d2.method;


public class TestBox {

	public static void main(String[] args) {
		Box UPS = new Box();
		Box FedEX = new Box();
		
		UPS.length = 10;
		UPS.width = 15;
		//System.out.println(UPS);
		int areaUPS = UPS.calculateArea(4,3);
		
		FedEX.length = 30;
		FedEX.width = 5;
		//System.out.println(FedEX.toString());
		int areaFedEX = FedEX.calculateArea(5,4);
		
		System.out.println("Total Area "+ (areaUPS + areaFedEX));
	}

}
