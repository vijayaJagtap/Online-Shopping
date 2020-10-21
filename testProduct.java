# Online-Shopping
Creating Online shopping system
package com.iacsd.product;

import java.util.Scanner;

public class TestProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Customer c= new Customer(null, null, null, null, 0);
		System.out.println("Enter Product1 Details:");
		// String initialName=sc.next();
		String pID = sc.next();
		String name = sc.next();
		String supplier = sc.next();
		String status = sc.next();

		Product c1 = new Product(pID, name, supplier, status);
		System.out.println(c1.printProduct());

		System.out.println("Enter Product2 Details:");
		// String initialName=sc.next();
		String pID1 = sc.next();
		String name1 = sc.next();
		String supplier1 = sc.next();
		String status1 = sc.next();

		Product c2 = new Product(pID1, name1, supplier1, status1);
		System.out.println(c2.printProduct());

		c1.printProduct();
		c1.getName();
		c2.printProduct();
		c2.getName();

	}
}
