package com.jspiders.solidprinciples.dip;

public class GetProduct {

	public static Product getService()
	{
		Product product = new SQLRepository();
		return product;
	}
	
}
