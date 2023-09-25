package com.gentech.abstractdemo;
abstract class Customer1
{
	void showcust1(String name)
	{
		System.out.println("customer name:"+name);
	}
}
class Customer2 extends Customer1
{
	void showcust2(int custid)
	{
		System.out.println("customer id:"+custid);
	}
}
class Customer3 extends Customer2
{
	void showcust3(int amount)
	{
		System.out.println("customer amount:"+amount);
	}
}

public class Multileveldemo {

	public static void main(String[] args) {
		Customer3 obj=new Customer3();
		obj.showcust3(1000);
		obj.showcust2(11);
		obj.showcust1("vandhu");

	}

}
