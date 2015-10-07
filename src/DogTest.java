import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
public class DogTest {

	@Test
	public void new_dogs_are_awake() {
		Dog spot = new Dog();
		assertEquals("dog should not be sleeping", false, spot.isSleeping());
	}

	@Test
	public void isSleeping_is_true_after_dog_is_told_to_sleep() {
		Dog spot = new Dog();
		spot.sleep();
		assertEquals("dog should be sleeping", true, spot.isSleeping());
	}
	
	@Test
	public void isSleeping_is_false_after_dog_is_told_to_wakeUp() {
		Dog spot = new Dog();
		spot.sleep();
		spot.wakeUp();
		assertEquals("dog should not be sleeping", false, spot.isSleeping());
	}
	
	@Test
	public void dog_says_woof_when_awake() {
		Dog spot = new Dog();
		assertEquals("dog should say \"woof!\"", "woof!", spot.makeSound());
	}
	
	@Test
	public void dog_says_zzzz_when_sleeping() {
		Dog spot = new Dog();
		spot.sleep();
		assertEquals("dog should say \"Zzzz...\"", "Zzzz...", spot.makeSound());
	}
}
