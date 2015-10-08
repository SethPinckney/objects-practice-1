import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
public class ShoppingCartTest {

	private static final double ALLOWED_DELTA = .001;

	@Test
	public void totalNumberOfItems_starts_at_zero() {
		ShoppingCart cart = new ShoppingCart();
		assertEquals("totalNumberOfItems should start at zero", 0, cart.getTotalNumberOfItems());
	}

	@Test
	public void totalAmountOwed_starts_at_zero() {
		ShoppingCart cart = new ShoppingCart();
		assertEquals("totalAmountOwed should start at zero", 0.0, cart.getTotalAmountOwed(), ALLOWED_DELTA);
	}

	@Test
	public void averagePricePerItem_starts_at_zero() {
		ShoppingCart cart = new ShoppingCart();
		assertEquals("averagePricePerItem should start at zero", 0.0, cart.getAveragePricePerItem(), ALLOWED_DELTA);
	}

	@Test
	public void totalNumberOfItems_tracks_the_number_of_items_added_to_the_cart() {
		ShoppingCart cart = new ShoppingCart();
		cart.addItems(2, 1.00);
		cart.addItems(3, 1.00);
		cart.addItems(4, 1.00);
		assertEquals(9, cart.getTotalNumberOfItems());
	}

	@Test
	public void totalAmountOwed_tracks_the_total_amount_owed_for_all_items_added_to_the_cart() {
		ShoppingCart cart = new ShoppingCart();
		cart.addItems(2, 7.50);
		cart.addItems(3, 6.00);
		cart.addItems(4, 5.75);
		assertEquals(56.00, cart.getTotalAmountOwed(), ALLOWED_DELTA);
	}

	@Test
	public void averagePricePerItem_calculates_the_average_price_of_items_added_to_the_cart() {
		ShoppingCart cart = new ShoppingCart();
		cart.addItems(3, 2.00);
		cart.addItems(4, 3.00);
		cart.addItems(1, 2.00);
		assertEquals(2.50, cart.getAveragePricePerItem(), ALLOWED_DELTA);
	}
}
