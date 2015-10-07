import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
public class SwitchTest {

	@Test
	public void initializes_to_off() {
		Switch mySwitch = new Switch();
		assertEquals("Switch should be \"off\"", true, mySwitch.isOff());
		assertEquals("Switch should not be \"on\"", false, mySwitch.isOn());
	}
	
	@Test
	public void turnOn_sets_isOn_to_true_and_isOff_to_false() {
		Switch mySwitch = new Switch();
		mySwitch.turnOn();
		assertEquals("Switch should be \"on\"", true, mySwitch.isOn());
		assertEquals("Switch should not be \"off\"", false, mySwitch.isOff());
	}
	
	@Test
	public void turnOff_sets_isOff_to_true_and_isOn_to_false() {
		Switch mySwitch = new Switch();
		mySwitch.turnOn();
		mySwitch.turnOff();
		assertEquals("Switch should be \"off\"", true, mySwitch.isOff());
		assertEquals("Switch should not be \"on\"", false, mySwitch.isOn());
	}

}
