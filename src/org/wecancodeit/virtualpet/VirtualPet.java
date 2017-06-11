package org.wecancodeit.virtualpet;

public class VirtualPet {

	private String name;
	private String description;
	
	private int hunger = 50; // default value
	
	private NumberGenerator randomnessGenerator = new RandomNumberGenerator();

	public int getHunger() {
		return hunger;
	}

	public VirtualPet(String name, String description) {
		this.name = name;
		this.description = description;
	}

	/**
	 * This method exists only for testing purposes. Don't hesitate to create
	 * methods just to support testing.
	 */
	public VirtualPet(String name, String description, NumberGenerator randomnessGenerator) {
		// we could call the other constructor like this instead of assigning name and description:
		//	this(name, description);
		this.name = name;
		this.description = description;
		// here we are overriding the default for testing
		this.randomnessGenerator = randomnessGenerator;
	}

	public void tick() {
		// we increase hunger by five, then by an additional random amount
		hunger += 5;
		hunger += randomnessGenerator.generate();
	}
}
