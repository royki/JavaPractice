package exm.d4.errorhandling;

public class ExmException {
	public static void main(String[] args) {
		int d[] = new int[3];
		int a = 10;
		int b = 0, c = 0;

		// run time exception
		try {
			d[4] = 10;
			c = a / b;
			return;
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println(e);			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally block always run");
		}
	}
}
