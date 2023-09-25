package com.gentech.Interfacedemo;
interface shoppingmallloc
{
	void showshoppingmallloc(String name);
}
interface mallname extends shoppingmallloc
{
	void showmallname (String name);
}
interface feedback extends mallname 
{
	void showdetails(String feedback);
}
class Mall1 implements mallname
{
	public void showmallname(String name)
	{
		System.out.println("mallname:"+name);
	}
	public void showshoppingmallloc(String name)
	{
		System.out.println("mall location:"+name);
	}
}
class Mall2 implements feedback
{
	public void showmallname(String name)
	{
		System.out.println("mallname:"+name);
	}
	public void showshoppingmallloc(String name)
	{
		System.out.println("mall location:"+name);
	}
	public void showdetails(String feedback)
	{
		System.out.println("details:"+feedback);
	}
}

public class Assign5hierchicalinterfacedemo {
	public static void main(String[]args) {
		Mall1 obj1=new Mall1();
		obj1.showmallname("ravipriyamall");
		obj1.showshoppingmallloc("ongole");
		System.out.println("++++++++");

		Mall2 obj2=new Mall2();
		obj2.showmallname("trends");
		obj2.showshoppingmallloc("ongole");
		obj2.showdetails("good");
	}

}
