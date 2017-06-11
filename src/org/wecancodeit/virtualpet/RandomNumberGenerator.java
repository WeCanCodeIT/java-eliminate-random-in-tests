package org.wecancodeit.virtualpet;

import java.util.Random;

public class RandomNumberGenerator implements NumberGenerator {

	private Random generator = new Random();

	/**
	 * This implementation generates a random number from 1-5, inclusive, each
	 * time it is called.
	 */
	@Override
	public int generate() {
		return generator.nextInt(4) + 1;
	}

}
