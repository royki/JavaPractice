package exm.d4.collections;

import java.util.ArrayList;
import java.util.List;

public class ExmList extends Object {

	public static void main(String[] args) {
		
		//Non Generic List, can add any type of data
		List list = new ArrayList();
		list.add(1);
		list.add("one");
		list.add(0);
		list.add(true);

		// All classes extend the object class
		for (Object temp : list) {
			System.out.println(temp);
		}
		System.out.println("-------------------");
		//Generic List
		List<String> gList = new ArrayList<>();
		gList.add("Aaaa");
		gList.add("Bbbb");
		for (String temp: gList) {
			System.out.println(temp);
		}		
	}
}
