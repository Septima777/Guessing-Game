package oop2;

import java.util.Scanner;

/**
 * Game of guessing a secret number.
 * 
 * @author Noppawan Kulchol 
 */
public class GameConsole {

	/**
	 * The play method plays a game using input from a user.
	 * 
	 * @param To print the game on the console.
	 * @return The number that correct.
	 */

	public int play(GuessingGame game) {
		System.out.println("GUESSING GAME!!!");
		Scanner scan = new Scanner(System.in);
		System.out.println(game.getHint());
		int number = 0;
		boolean check;
		do{ 
			System.out.print("What is your guess?   ");
			number = scan.nextInt();
			check = game.guess(number);
			System.out.println(game.getHint());
		
		}while(!check);
		
		System.out.println("You used " + game.getCount() + " guesses");
		return number;
	}

	

}
