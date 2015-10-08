
/**
 * This class represents a shopping cart that you can add different priced items
 * to. Note that you cannot remove items from the cart (better for business!)
 */
public class ShoppingCart {

	private int totalAmountItems;
	private double totalCostCart;
	private double avgPricePerItem;

	public ShoppingCart() {

		totalAmountItems = 0;
		totalCostCart = 0;
		avgPricePerItem = 0;

	}

	/**
	 * Adds items to the cart.
	 * 
	 * @param numberOfItems
	 *            the number of items being added to the cart
	 * @param pricePerItem
	 *            the price per item being added to the cart
	 */
	public void addItems(int numberOfItems, double pricePerItem) {

		totalAmountItems = numberOfItems + totalAmountItems;

		totalCostCart = (numberOfItems * pricePerItem) + totalCostCart;

		avgPricePerItem = totalCostCart / totalAmountItems;

	}

	/**
	 * @return the total number of items that have been added to this cart
	 */
	public int getTotalNumberOfItems() {

		return totalAmountItems;
	}

	/**
	 * @return the total price of all items that have been added to the cart
	 */
	public double getTotalAmountOwed() {

		return totalCostCart;

	}

	/**
	 * The average price of all items that have been added to the cart. This
	 * should be equal to the totalAmountOwed divided by the totalNumberOfItems.
	 * 
	 * @return the average price of items added to the cart
	 */
	public double getAveragePricePerItem() {

		return avgPricePerItem;
	}
}
