package exm.d1;

public class ExmpArray {

	public static void main(String[] args) {
		int[] arr = {2,3,4,5,6};
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}		
		for(int temp: arr) {
			System.out.println(temp);
		}
		
		int arr1[] = new int[5];
		arr1[0] = 12;
		arr1[1] = 22;
		for(int temp1: arr1) {
			System.out.println(temp1);
		}
		
		String[] str = new String[5];
		str[0] = "hi";
		str[1] = "hello";
		for(String temp2: str) {
			System.out.println(temp2);
		}
		
	}

}
