# Online-Shopping
Creating Online shopping system
creating product
package com.iacsd.product;

public class Product {

	private String pId;
	private String name;
	private String suplier;
	private String status;

	public Product(String pId, String name, String suplier, String status) {
		this.pId = pId;
		this.name = name;
		this.suplier = suplier;
		this.status = status;
	}

	public String printProduct() {
		String Details = "Product Details: ( " + pId + ", " + name + ", " + suplier + ", " + status + ")";
		return Details;
	}

	public String getName() {
		return this.name;
	}
}
