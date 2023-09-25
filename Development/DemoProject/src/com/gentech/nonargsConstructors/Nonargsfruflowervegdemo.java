package com.gentech.nonargsConstructors;
class Fruits
{
	String fruitname;
	int quantity;
	String shopname;
	int price;
	Fruits()
	{
		fruitname="mango";
		price=100;
		shopname="xyz";
		quantity=2;
		System.out.println(fruitname);
		System.out.println(shopname);
		System.out.println(quantity);
		System.out.println(price);
		System.out.println("+++++++++++");
	}
}
class Flowers
{
	String flowername;
	int quantity;
	int price;
	String shopname;
	Flowers()
	{
		flowername="rose";
		price=100;
		shopname="xyz";
		quantity=2;
		System.out.println(flowername);
		System.out.println(shopname);
		System.out.println(quantity);
		System.out.println(price);
		System.out.println("+++++++++++");

	}
}
class Vegtables
{
	String vegtablename;
	int quantity;
	int price;
	String shopname;
	Vegtables()
	{
		vegtablename="potato";
		price=100;
		shopname="xyz";
		quantity=2;
		System.out.println(vegtablename);
		System.out.println(shopname);
		System.out.println(quantity);
		System.out.println(price);
	}
}
public class Nonargsfruflowervegdemo {
	public static void main(String[] args) {
		Fruits fruit=new Fruits();
		Flowers flower=new Flowers();
		Vegtables veg=new Vegtables();


	}

}
