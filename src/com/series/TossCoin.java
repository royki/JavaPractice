package com.series;

import java.util.Random;

public class TossCoin {

	public String isHeadTail(){
		Random rand = new Random();
		int toss = Math.abs(rand.nextInt()) % 2;
		if(toss == 0) {
			return "Head";
		}else {
			return "Tail";
		}
	}
	
	public static void main(String[] args) {
		TossCoin game = new TossCoin();
		for(int i = 0; i < 10; i++){
			System.out.println(game.isHeadTail());
		}
	}
}
