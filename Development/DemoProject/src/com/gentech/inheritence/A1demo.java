package com.gentech.inheritence;
class Location
{
	void showlocname(String locname)
	{
		System.out.println("place name:"+locname);
	}
}
class Location1 extends Location
{
	Location1(String name)
	{
		super.showlocname(name);
	}
	
	void showlocname(String locname)
	{
		System.out.println("location name in sub class:"+locname);
	}
}
class Location2 extends Location1
{
	Location2(String address)
	{
		super(address);
		super.showlocname(address);	
		
	}
	void showlocname(String Area)
	{
		System.out.println("near by address:"+Area);
	}
}
public class A1demo {

	public static void main(String[] args) {
		Location2 obj=new Location2("banglore");
		

	}

}
