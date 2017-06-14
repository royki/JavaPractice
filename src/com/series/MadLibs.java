package com.series;

import java.util.Random;
import java.util.Scanner;

public class MadLibs {

	Scanner sc = new Scanner(System.in);
	String story;
	String name;
	String adjective1;
	String adjective2;
	String noun1;
	String noun2;
	String noun3;
	String adverb;
	String randomNums;
	Random rand = new Random();

	// Getters & Setters
	public String getStory() {
		return story;
	}

	public void setStory(String newStory) {
		this.story = newStory;
	}

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public String getAdjective1() {
		return adjective1;
	}

	public void setAdjective1(String newAdjective1) {
		this.adjective1 = newAdjective1;
	}					

	public String getAdjective2() {
		return adjective2;
	}

	public void setAdjective2(String newAdjective2) {
		this.adjective2 = newAdjective2;
	}

	public String getNoun1() {
		return noun1;
	}

	public void setNoun1(String newNoun1) {
		this.noun1 = newNoun1;
	}

	public String getNoun2() {
		return noun2;
	}

	public void setNoun2(String newNoun2) {
		this.noun2 = newNoun2;
	}

	public String getNoun3() {
		return noun3;
	}

	public void setNoun3(String newNoun3) {
		this.noun3 = newNoun3;
	}

	public String getAdverb() {
		return adverb;
	}

	public void setAdverb(String newAdverb) {
		this.adverb = newAdverb;
	}

	public String getRandomNums() {
		return randomNums;
	}

	public void setRandomNums() {
		int num = Math.abs(rand.nextInt()) % 100;
		int index = 0;
		int[] numHolder = new int[3];
		while (index < numHolder.length) {
			numHolder[index] = num + index;
			index++;
		}
		randomNums = "not " + numHolder[0] + ", not " + numHolder[1] + ", but " + numHolder[2];
	}

	public void printInstructions() {
		System.out.println(
				"Welcome to MadLabs game. If you type in words, we'll give, you a story. Start by Typing in a name");
	}

	// Get Data from Console
	public void enterName() {
		setName(sc.nextLine());
	}

	public void enterNoun1() {
		System.out.println("Enter a noun ");
		setNoun1(sc.nextLine());
	}

	public void enterNoun2() {
		System.out.println("Enter another noun ");
		setNoun2(sc.nextLine());
	}

	public void enterNoun3() {
		System.out.println("Enter last noun ");
		setNoun3(sc.nextLine());
	}

	public void enterAdjective1() {
		System.out.println("Enter an adjective ");
		setAdjective1(sc.nextLine());
	}

	public void enterAdjective2() {
		System.out.println("Enter another adjective  ");
		setAdjective2(sc.nextLine());
	}

	public void enterAderb() {
		System.out.println("Enter another adverb ");
		setAdverb(sc.nextLine());
	}

	public void putTogetherTheStory() {
		String story;
		int num = Math.abs(rand.nextInt()) % 2;

		if (num == 0) {
			story = "Jesse and her best friend " + getName() + " went to Disney World today!" + "They saw a " + getNoun1()
					+ " in a show at the Magic Kingdom" + "and ate a " + getAdjective1()
					+ " feast for dinner. The next day 1" + " ran " + getAdverb() + " to meet Mickey Mouse is his "
					+ getNoun2() + " " + "and then that night I gazed at the " + getRandomNums() + " " + getAdjective2()
					+ " firewworks shooting frok the " + getNoun3() + ".";
		} else {
			story = "Amanda and her friend " + getName() + " went to the zoo last summer. " + "They saw a huge "
					+ getNoun1() + " and a tiny little " + getNoun2() + ". That night" + " they decided to climb "
					+ getAdverb() + " into the " + getNoun3() + " to get a closer look. " + "The zoo was "
					+ getAdjective1() + " at night, but they didn't care... " + "until " + getRandomNums() + " "
					+ getAdjective2() + " apes yelled in their faces, making " + "Amanda and " + getName()
					+ " sprint all the way back home.";
		}
		setStory(story);
	}

	public void play() {
		enterName();
		enterNoun1();
		enterAdjective1();
		enterAdjective2();
		enterNoun2();
		enterAderb();
		enterNoun3();
		setRandomNums();
		putTogetherTheStory();
		System.out.println(getStory());
	}

	public static void main(String[] args) {
		MadLibs game = new MadLibs();
		game.printInstructions();
		game.play();
	}
}
