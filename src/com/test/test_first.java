package com.test;


public class test_first{
	
	/*public static void main(String[]args){
		System.out.println("Hello, World!");		
		System.out.println(new Date());
	
		System.getProperties().list(System.out);
		System.out.print(System.getProperty("user.name"));
		System.out.println(
		System.getProperty("java.library.path"));
	}*/
	
	public static class book {
		
		protected static String author;
		protected void modifyTemp(){		
		}
	}
	
	public class courseBook extends book {
		public courseBook(){
			author = "Roy";
			modifyTemp();
		}
	}
	
	public class librarian{
		public librarian(){
			book myBook = new book();
			book.author = "Kiran";
		}
	}
}

