package exm.d1;

public class Exe2 {

	public static void main(String[] args) {
		String[] nums = {"3","2","4","52","1","4"};
		int total = 0;
		for(String temp: nums) {
			total += Integer.parseInt(temp);
		}
		System.out.println("Total " + total);
	}

}
