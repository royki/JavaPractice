package exm.d4.vararg;

public class ExmVarArgs {

	// Variavle arguments
	public static void addNums(int... a) {
		int sum = 0;

		for (int x : a) {
			sum += x;
		}
		System.out.println(sum);
	}
}
