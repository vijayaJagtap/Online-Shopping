# Online-Shopping
Creating Online shopping system

package com.iacsd.onlineShopping;

public class Customer {

	private String name;
	private String id;
	private String address;
	private int phone;
	private String email;

	public Customer(String initialName, String ID, String Address, String Email, int Phone) {
		this.name = initialName;
		this.id = ID;
		this.address = Address;
		this.phone = Phone;
		this.email = Email;
	}

	public String printCustomer() {
		String Details = "Customer Details: ( " + name + ", " + id + ", " + address + ", " + email + "," + phone + ")";
		return Details;
	}

	public String getName() {
		return this.name;
	}
}
