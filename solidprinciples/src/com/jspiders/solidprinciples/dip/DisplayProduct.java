package com.jspiders.solidprinciples.dip;

public class DisplayProduct {

	public void display()
	{
		Product product= GetProduct.getService();
		int products = product.readProducts();
		System.out.println("Products per page is : "+products/10);
	}
	
}
