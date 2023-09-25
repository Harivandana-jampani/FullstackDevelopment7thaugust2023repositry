package com.gentech.Constructoroverloadingdemo;
class Products
{
	Products(String productname)
	{
		System.out.println("productname:"+productname);
	}
	Products(int Productid,int price)
	{
		System.out.println("productid:"+Productid);
		System.out.println("price:"+price);
	}
}

public class Productconstoverloadingdemo {

	public static void main(String[] args) {
		Products obj1=new Products("bag");
		Products obj2=new Products(11,1500);

	}

}
