package com.test1;

public class second {

	public static void main(String args[]) {
				
/*		int baseDecimal = 267;
		int octVal = 0413;
		int hexVal = 0x10B;
		int binVal = 0b100001011;
		System.out.println(baseDecimal + octVal);
		System.out.println(hexVal + binVal);
*/						
		for(char c1 = 65; c1 <= 122; c1++){
			System.out.print(c1 + "|");				
		}
		System.out.println();
		char c2 = '\u0122';
		char c3 = (char)-122;
				
		System.out.println("c2 :" + c2);
		System.out.println("c3 :" + c3);
		
		
		System.out.println("----------");
		
		int[][] twoArr = new int[5][5];		
		int temp = 10;		
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){				
					twoArr[i][j] = temp;
					temp +=10;				
			}
		}
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){				
				System.out.print(twoArr[i][j] + "|");
			}
			System.out.println();
		}
		System.out.println("----------");
		int A = 10;		
		A = A++ + A + A-- - A-- + ++A;
		System.out.println("A :" + A);
		System.out.println("----------");
		int B = 10;
		B = ++B + B + --B - --B + B++;
		System.out.println("B :" + B);
		System.out.println("----------");
		
		String name = "Kiran";
		if(name == null || name.length() != 0 ){
			System.out.println("Name :" + name);
			
		String[] table = {"aa" , "bb" , "cc"};		
			for(String tempTab: table){
				int ii =0;
				while(ii< table.length){
					System.out.print(tempTab + "," + ii +"|");
					ii++;
				}
			}
		}
	}
}
