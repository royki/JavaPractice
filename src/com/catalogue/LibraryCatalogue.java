package com.catalogue;

import java.util.HashMap;
import java.util.Map;

public class LibraryCatalogue {

	Map<String, Book> bookCollection = new HashMap<String, Book>();
	int currentDay = 0;
	int lengthOfCheckoutPeriod = 7;
	double initialLateFee = 0.50;
	double feePerLateDay = 1.00;

	// Constructors
	public LibraryCatalogue(Map<String, Book> collection) {
		this.bookCollection = collection;
	}

	public LibraryCatalogue(Map<String, Book> collection, int lengthOfCheckoutPeriod, double initialLateFee,
			double feePerLateDay) {
		this.bookCollection = collection;
		this.lengthOfCheckoutPeriod = lengthOfCheckoutPeriod;
		this.initialLateFee = initialLateFee;
		this.feePerLateDay = feePerLateDay;
	}

	// Getters
	public int getCurrentDay() {
		return this.currentDay;
	}

	public Map<String, Book> getBookCollection() {
		return this.bookCollection;
	}

	public Book getBook(String bookTitle) {
		return getBookCollection().get(bookTitle);
	}

	public int getLengthOfCheckoutPeriod() {
		return this.lengthOfCheckoutPeriod;
	}

	public double getIntialLateFee() {
		return this.initialLateFee;
	}

	public double getFeePerLateDay() {
		return this.feePerLateDay;
	}

	// Setters
	public void nextDay() {
		currentDay++;
	}

	public void setDay(int day) {
		currentDay = day;
	}

	// INSTANCE METHODS
	public void checkOutBook(String title) {
		Book book = getBook(title);
		if (book.getIsCheckedOut()) {
			bookAllreadyCheckedOut(book);
		} else {
			book.setIsCheckedOut(true, currentDay);
			System.out.println("You just check out " + title + " It is due on day "
					+ (getCurrentDay() + getLengthOfCheckoutPeriod()) + ".");
		}
	}

	public void returnBook(String title) {
		Book book = getBook(title);
		int daysLate = currentDay - (book.getDayCheckOut() + getLengthOfCheckoutPeriod());
		if (daysLate > 0) {
			System.out.println("You owe the library " + (getIntialLateFee() + daysLate * getFeePerLateDay())
					+ " because your book is " + daysLate + " days overdue");
		} else {
			System.out.println("Book Returned. Thank YOU");
		}
		book.setIsCheckedOut(false, -1);
	}

	public void bookAllreadyCheckedOut(Book book) {
		System.out.println("Sorry, " + book.getTitle() + " is already checked out. " + "It should be back on day "
				+ (book.getDayCheckOut() + getLengthOfCheckoutPeriod()) + ".");
	}

	public static void main(String[] args) {
		Map<String, Book> bookCollection = new HashMap<String, Book>();
		Book book1 = new Book("Harry Potter", 821121, 999999);
		bookCollection.put("Harry Potter", book1);
		LibraryCatalogue lib = new LibraryCatalogue(bookCollection);
		lib.checkOutBook("Harry Potter");
		lib.nextDay();
		lib.nextDay();
		lib.nextDay();
		lib.checkOutBook("Harry Potter");
		lib.setDay(15);
		lib.returnBook("Harry Potter");
		lib.checkOutBook("Harry Potter");
	}

}
