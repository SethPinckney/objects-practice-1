
public class Dog {

	private boolean isAwake;

	public Dog() {

		isAwake = true;

	}

	/**
	 * @return "woof!" if the dog is awake, otherwise "Zzzz..."
	 */
	public String makeSound() {

		if (isAwake) {
			return "woof!";
		}

		else {
			return "Zzzz...";
		}
	}

	/**
	 * Puts the dog to sleep
	 */
	public void sleep() {

		this.isAwake = false;

	}

	/**
	 * Wakes the dog up
	 */
	public void wakeUp() {

		this.isAwake = true;

	}

	/**
	 * @return true if the dog is sleeping, otherwise false
	 */
	public boolean isSleeping() {

		return !isAwake;

	}
}
