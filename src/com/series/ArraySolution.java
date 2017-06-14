package com.series;

import java.util.Scanner;

public class ArraySolution {
	
	public static int[] reverseArray(int[] arr1) {
		for(int i = arr1.length; i > 0; i--) {
			System.out.print(arr1[i-1]+ " ");
			
		}
		return arr1;
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        /*for(int i = arr.length; i > 0; i--) {
			System.out.print(arr[i-1]+ " ");
		}*/
        java.util.Arrays.toString(reverseArray(arr));
        in.close();
    }
}
