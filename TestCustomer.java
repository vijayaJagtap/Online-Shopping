# Online-Shopping
Creating Online shopping system
package com.iacsd.onlineShopping;

import java.util.Scanner;

public class OnlineShopping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Customer c= new Customer(null, null, null, null, 0);
		System.out.println("Enter Coustmor Details:");
		String initialName = sc.next();
		String ID = sc.next();
		String Address = sc.next();
		String Email = sc.next();
		int Phone = sc.nextInt();

		Customer c1 = new Customer(initialName, ID, Address, Email, Phone);
		System.out.println(c1.printCustomer());

		Customer c1 = new Customer("vijaya", "v@gmail.com", "Atpadi", "9960331702", 'A');
		System.out.println(c1.printCustomer());

		c1.printCustomer();
		c1.getName();

	}

}
