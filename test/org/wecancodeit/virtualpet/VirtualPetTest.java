package org.wecancodeit.virtualpet;

import static org.junit.Assert.*;

import org.junit.Test;

public class VirtualPetTest {

	/*
	 * These are constants. <code>static</code> means they're defined at the
	 * class level, <code>final</code> means they can't be reassigned.
	 * 
	 * By convention, we define them in all capitals and snake case (with
	 * underscores).
	 */
	private static final int DEFAULT_HUNGER = 50;
	private static final int HUNGER_INCREASE_ON_TICK = 5;
	private static final int RANDOM_ALWAYS_RETURNS = 42;

	private NumberGenerator fakeRandomnessGenerator = new NumberGeneratorTestDouble(RANDOM_ALWAYS_RETURNS);

	@Test
	public void shouldIncreaseHungerOnTick() {
		VirtualPet underTest = new VirtualPet("my pet's name", "my pet's description", fakeRandomnessGenerator);

		underTest.tick();

		int expectedHunger = DEFAULT_HUNGER + HUNGER_INCREASE_ON_TICK + RANDOM_ALWAYS_RETURNS;
		int actualHunger = underTest.getHunger();

		assertEquals(expectedHunger, actualHunger);
	}
}
