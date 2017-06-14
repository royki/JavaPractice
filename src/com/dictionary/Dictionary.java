package com.dictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Dictionary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> engSpanDictionary = new HashMap<String, String>();
		engSpanDictionary.put("Monday", "Lunes");
		engSpanDictionary.put("Tuesday", "Martes");
		engSpanDictionary.put("Wednesday", "Miercoles");
		engSpanDictionary.put("Thursday", "Jueves");
		engSpanDictionary.put("Friday", "Viernes");
		engSpanDictionary.put("Saturday", "Sabado");
		engSpanDictionary.put("Sunday", "Domingo");

		// Print out all keys
		System.out.println(engSpanDictionary.keySet());
		// Print out all values
		System.out.println(engSpanDictionary.values());
		// Print out size
		System.out.println("Size of dictionary is " + engSpanDictionary.size());

		// Iterate over HashMap
		// Only KEY
		for (String key : engSpanDictionary.keySet()) {
			System.out.println("KEY =>" + key);
		}
		//Only VALUE
		for (String value : engSpanDictionary.values()) {
			System.out.println("Value => " + value);
		}
		
		// KEY & Value
		for (Entry<String, String> dict : engSpanDictionary.entrySet()) {
			System.out.println(dict.getKey() + " : " + dict.getValue());
		}
	

		// engSpanDictionary.remove("Monday");
		// engSpanDictionary.put("Janu", "Janv");
		// engSpanDictionary.replace("Thursday", "Jeudi");
		// engSpanDictionary.replace("Tuesday", "Martes", "Mardi");
		// engSpanDictionary.clear();
		// System.out.println(engSpanDictionary.containsKey("Sunday"));
		// Retrieve things from dictionary
		// System.out.println(engSpanDictionary.toString());
		// System.out.println(engSpanDictionary.get("Monday"));
		// System.out.println(engSpanDictionary.get("Tuesday"));
		// System.out.println(engSpanDictionary.get("Wednesday"));
		// System.out.println(engSpanDictionary.get("Thursday"));
		// System.out.println(engSpanDictionary.get("Friday"));

	}
}
