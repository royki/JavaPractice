package exm.d4.collections;

import java.util.HashMap;

public class ExmHashMap {
	
	public static void main(String[] args) {
		
		//Non Generic
		HashMap HM = new HashMap();		
		HM.put("Alex", 98765.40);		
		System.out.println(HM.get("Alex"));
				
		//Generic
		HashMap<Integer, String> HM1 = new HashMap<>();
		HM1.put(1, "Alex");
		HM1.put(2, "Lynda");
		System.out.println(HM1.get(1));
	}
}
