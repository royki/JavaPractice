package exm.d1;

public class TwoDimArray {

	public static void main(String[] args) {
		int[][] twoDim = new int[4][3];
		int temp = 10;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				twoDim[i][j] = temp;
				temp += 10;
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(twoDim[i][j] + "|");				
			}
			System.out.println("");
		}
	}

}
