/**
 * This class represents an on/off switch.
 */

public class Switch {

	private boolean isUp;

	public Switch() {

		isUp = false;
	}

	/**
	 * Turns the switch on.
	 */
	public void turnOn() {

		this.isUp = true;

	}

	/**
	 * Turns the switch off.
	 */
	public void turnOff() {

		this.isUp = false;
	}

	/**
	 * @return true if the switch is currently on, otherwise false
	 */
	public boolean isOn() {
		return isUp;
	}

	/**
	 * @return true if the switch is currently off, otherwise false
	 */
	public boolean isOff() {
		return !isUp;
	}
}

/*
 * 
 * public class Counter { private static int globalCount = 0; private int
 * myCount;
 * 
 * public Counter() { myCount = 0; }
 * 
 * public void increment() { globalCount++; // this static variable can be
 * referenced from an instance method because statics are available to all
 * instances of a class myCount++; }
 * 
 * public int getMyCount() { return myCount; }
 * 
 * public static int getGlobalCount() { //return myCount; // this is a compiler
 * error because you cannot reference instance variables from a static method
 * //getMyCount(); // this is a compiler error because you cannot reference a
 * instance method from a static method return globalCount; } }
 */