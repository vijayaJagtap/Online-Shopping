# Online-Shopping
Creating Online shopping system
package com.iacsd.OnlineShopping;

import java.text.NumberFormat;

public class Item1 {
	private String itemName;
	private double price;
	private int quantity;

	public Item1(String itm, double prc, int qty) {
		// TODO Auto-generated constructor stub
		itemName = itm;
		price = prc;
		quantity = qty;
	}

	public String toString() // this method is called when an object needs to be "printed"
	// (when System.out.println() is called, this overriden method is called)
	{
		// NumberFormat fmt = NumberFormat.getCurrencyInstance();
		String contents = itemName + "\t" + price + "\t" + quantity;

		return contents;
	}

}
