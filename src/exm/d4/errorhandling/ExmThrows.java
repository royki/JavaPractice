package exm.d4.errorhandling;

public class ExmThrows {

	public int divideNums(int a, int b) throws Exception {
		int c = 0;		
		try {
			c = a / b;
		} catch (Exception e) {
			System.out.println(e);
			throw new Exception("Plese check");
		}
		return c;
	}
	
/*	public static void main(String[] args) {

		ExmThrows D1 = new ExmThrows();
		int a;
		try {
			a = D1.divideNums(10, 2);
			System.out.println(a);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/
}
