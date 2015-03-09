package exm.d4.errorhandling;

public class TestThrows {

	public static void main(String[] args) {

		ExmThrows D1 = new ExmThrows();
		int a;
		try {
			a = D1.divideNums(10, 2);
			System.out.println(a);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
