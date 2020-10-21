# Online-Shopping
Creating Online shopping system
package com.iacsd.OnlineShopping;

import java.text.NumberFormat;
import java.util.Scanner;

public class cart {

	private int itemCount; // total number of items in the cart
	private double totalPrice; // total price of items in the cart
	private int capacity; // current cart capacity
	private Item1[] cart; // the actual array of items to store things in the cart

	public cart() {
		capacity = 3;
		itemCount = 0;
		totalPrice = 0.0;
		cart = new Item1[capacity];
	}


	public void addToCart(String itemName, double price, int quantity) {
		cart[itemCount++] = new Item1(itemName, price, quantity);
		totalPrice += price * quantity;
		if (itemCount == capacity) // if full, increase the size of the cart
			increaseSize();
	}

	public String toString() {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		String contents = "\nShopping Cart\n";
		contents += "\nItem\tPrice\tQty\tTotal\n";
		for (int i = 0; i < itemCount; i++)
			contents += cart[i].toString() + "\n";
		contents += "\nTotal Price: " + fmt.format(totalPrice);
		contents += "\n";
		return contents;
	}


	private void increaseSize() {
		Item1[] tempItem = new Item1[capacity];
		capacity *= 2; // double the size

		for (int i = 0; i < itemCount; i++) {
			tempItem[i] = cart[i];
		}
		cart = new Item1[capacity];
		for (int i = 0; i < itemCount; i++) {
			cart[i] = tempItem[i];
		}

		// The above can also be accomplished by using:
		// System.arraycopy(...)
	}

	/**
	 * @return Returns the totalPrice.
	 */
	public double getTotalPrice() {
		return totalPrice;
	}

	public static void main(String[] args) {

		// ITEM item;
		String itemName;
		double itemPrice;
		int quantity;
		Scanner sc = new Scanner(System.in);
		String keepShopping = "y";
		// String y;
		cart c = new cart();
		do

		{

			System.out.print("Enter the name of the item: ");
			itemName = sc.nextLine();
			System.out.print("Enter the unit price: ");
			itemPrice = sc.nextDouble();
			System.out.print("Enter the quantity: ");
			quantity = sc.nextInt();
			// *** print the contents of the cart object using println
			System.out.print("Continue shopping (y/n)? ");
			// String y = sc.next();
			c.addToCart(itemName, itemPrice, quantity);
			// System.out.println(c.printDetails());

			keepShopping = sc.next();
			System.out.println(keepShopping);
		} while (keepShopping.equals("y"));
		System.out.println(c);
		return;
	}

}
