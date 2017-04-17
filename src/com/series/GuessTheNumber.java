package com.series;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	// static Random rand = new Random();
	// static int num = Math.abs(rand.nextInt());
	Scanner sc = new Scanner(System.in);
	int randomNum;
	int max;

	public void setMax(int max) {
		this.max = max;
	}
	
	public int getMax(){
		return this.max;
	}
		
	public GuessTheNumber() {
		max = 100;
		Random rand = new Random();
		randomNum =  Math.abs(rand.nextInt()) % (max + 1);
	}

	public void play() {
		while (true) {
			int inputNum = sc.nextInt();
			if (inputNum > randomNum) {
				System.out.println("Your number is too big");
			} else if (inputNum < randomNum) {
				System.out.println("Your number is too small");
			} else {
				System.out.println("Bingo !!!! You Got it");
				break;
			}
		}

	}

	public static void howBigIsMyNumber(int x) {

		if (x >= 0 && x <= 10) {
			System.out.println("Number is pretty small " + x);
		} else if (x > 11 && x <= 100) {
			System.out.println("Number is big " + x);
		} else {
			System.out.println("Number is out of range " + x);
		}
	}

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// int input = sc.nextInt();
		GuessTheNumber game = new GuessTheNumber();
		// game.howBigIsMyNumber(num);	
		System.out.println("GuessGame : Enter number in between 0 to " + game.max );
		game.play();
	}

}
