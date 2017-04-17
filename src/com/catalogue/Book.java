package com.catalogue;

public class Book {
	String title;
	int pageCount;
	int ISBN;
	boolean isCheckedOut;
	int dayCheckOut = -1;

	// Getter(Instance Method)
	public String getTitle() {
		return this.title;
	}

	public int getPageCount() {
		return this.pageCount;
	}

	public int getISBN() {
		return this.ISBN;
	}

	public boolean getIsCheckedOut() {
		return this.isCheckedOut;
	}

	public int getDayCheckOut() {
		return this.dayCheckOut;
	}

	// Setter Methods
	private void setDayCheckOut(int day) {
		this.dayCheckOut = day;
	}
	
	public void setIsCheckedOut(boolean newIsCheckedOut, int currentDayCheckedOut) {
		this.isCheckedOut = newIsCheckedOut;
		setDayCheckOut(currentDayCheckedOut);
	}

	// Constructor
	public Book(String bookTitle, int bookPageCount, int bookISBN) {
		this.title = bookTitle;
		this.pageCount = bookPageCount;
		this.ISBN = bookISBN;
		isCheckedOut = false;
	}

}
