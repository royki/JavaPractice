package exm.d1;

public class ExmpString {

	public static void main(String[] args) {
		String str = "Jamnes Dean";
		System.out.println(str.toUpperCase());				
		
		System.out.println(str.substring(2));
		System.out.println(str.subSequence(2, 3));
		System.out.println(str.charAt(3));
		
		//Wrapper Classes
		String age = "27";
		int a = Integer.parseInt(age);
		System.out.println(a);
	}
}
