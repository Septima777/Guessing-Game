package oop2;

import java.util.Random;
import java.util.Scanner;

/**
 * Game of guessing a secret number.
 * 
 * @author Noppawan Kulchol 
 */

public class Game {
	/* properties of a guessing game */

	/**
	 * Initialize a new game.
	 * 
	 * @param upperbound
	 *            is the max value for the secret number (>1).
	 */

	private int upperBound;
	private int secret;
	private String hint;
	private int count;

	Game(int upperBound) {
		this.upperBound = upperBound;
		this.secret = getRandomNumber(upperBound);
		this.hint = "I'm thinking of a number between 1 and "+ upperBound;

	}

	/**
	 * Create a random number between 1 and limit.
	 * 
	 * @param limit
	 *            is the upper limit for random number
	 * @return a random number between 1 and limit (inclusive)
	 */
	private int getRandomNumber(int limit) {
		long seed = System.currentTimeMillis();
		Random random = new Random(seed);
		return random.nextInt(limit) + 1;
	}

	public boolean guess(int number) {
		// Scanner scanner = new Scanner(System.in);
		boolean check = false;
		if (secret == number) {
			setHint("Correct. The secret is " + number);
			check = true;
			return check;
		} else {
			if (secret > number) {
				setHint("Sorry, your guess is too small");
			} else if (secret < number) {
				setHint("Sorry, your guess is too large");
			}
			return check;
		}
	}

	/**
	 * Return a hint based on the most recent guess.
	 * 
	 * @return hint based on most recent guess
	 */

	public String getHint() {
		return hint;
	}

	protected void setHint(String hint) {
		this.hint = hint;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
