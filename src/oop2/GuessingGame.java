package oop2;

import java.util.Random;

/**
 * Game of guessing a secret number.
 * 
 * @author Noppawan Kulchol
 */

public class GuessingGame {
	/* properties of a guessing game */
	private int upperBound;
	private int secret;
	private String hint;
	private int count;

	/**
	 * Initialize a new game.
	 * 
	 * @param upperbound
	 *            is the max value for the secret number (>1).
	 */
	GuessingGame(int upperBound) {
		this.upperBound = upperBound;
		this.secret = getRandomNumber(upperBound);
		this.hint = "I'm thinking of a number between 1 and " + upperBound;
		this.count = 0;

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

	/**
	 * 
	 * @param number
	 *            that I guessed.
	 * @return true when it's correct number or false when it's not correct
	 *         number.
	 */
	public boolean guess(int number) {
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

	/**
	 * Set the hint of game.
	 * @param hint
	 *            is the word that has to print when guess the correct number or
	 *            the wrong number.
	 */
	protected void setHint(String hint) {
		this.hint = hint;
	}

	/**
	 * Return a count of all guessing.
	 * 
	 * @return count of all guessing
	 */
	public int getCount() {
		return count;
	}

}
