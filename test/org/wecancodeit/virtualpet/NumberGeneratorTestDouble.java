package org.wecancodeit.virtualpet;

public class NumberGeneratorTestDouble implements NumberGenerator {

	private int valueToReturn;

	public NumberGeneratorTestDouble(int valueToReturn) {
		this.valueToReturn = valueToReturn;
	}

	/**
	 * This implementation always returns the value of
	 * <code>valueToReturn</code> so that we can eliminate randomness when
	 * writing tests.
	 */
	@Override
	public int generate() {
		return valueToReturn;
	}

}
