package com.gentech.abstractdemo;
abstract class Customers1
{
	abstract void showcust2(int custid);
	void showcust1(String name)
	{
		System.out.println("customer name:"+name);
	}
}
class Customers2 extends Customers1
{
	void showcust2(int custid)
	{
		System.out.println("customer id:"+custid);
	}
}
class Customers3 extends Customers2
{
	void showcust3(int amount)
	{
		System.out.println("customer amount:"+amount);
	}
}
class Customers4 extends Customers1
{
	void showcust4(int noofitems)
	{
		System.out.println("number of items :"+noofitems);
	}

		void showcust2(int custid)
		{
			System.out.println("customer id:"+custid);
		}
		
	}

public class Hybridabstractdemo {

	public static void main(String[] args) {
		Customers3 obj=new Customers3();
		obj.showcust3(1000);
		obj.showcust2(11);
		obj.showcust1("vandhu");

		Customers4 obj1=new Customers4();
		obj1.showcust4(10);
		obj1.showcust1("vardhan");

	}

}
