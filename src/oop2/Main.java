package oop2;

/**
 * Game of guessing a secret number.
 * 
 * @author Noppawan Kulchol 
 */
public class Main {	
	
	/** create objects and start the game */
	public static void main(String[] arg) {
		Game game = new Game(20);
		GameConsole ui = new GameConsole();
		ui.play(game);
	}
}
