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
}
