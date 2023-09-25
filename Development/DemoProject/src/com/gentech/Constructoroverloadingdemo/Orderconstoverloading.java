package com.gentech.Constructoroverloadingdemo;
class Orders
{
	Orders(String type,String name,String Customername)
	{
		System.out.println("type:"+type);
		System.out.println("name:"+name);
		System.out.println("custname:"+Customername);
	}
	Orders(int orderid,int price)
	{
		System.out.println("orderid:"+orderid);
		System.out.println("price:"+price);
	}
}

public class Orderconstoverloading {

	public static void main(String[] args) {
		Orders obj1=new Orders(11,1000);
		Orders obj2=new Orders("online","dress","chandhu");

	}

}
