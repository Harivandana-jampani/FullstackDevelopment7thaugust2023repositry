package com.gentech.Interfacedemo;
interface College1
{
	void showclgname(String name);
}
interface Address1 extends College1
{
	abstract void showaddress(String Address);
}
interface Branches1 extends Address1
{
	abstract void showbranches(String branches);
}
class Riseengclg1 implements Branches1
{
	public void showclgname(String name)
	{
		System.out.println("college name:"+name);
	}
	public void showaddress(String address)
	{
		System.out.println("address:"+address);
	}
	public void showbranches(String branches)
	{
		System.out.println("branches:"+branches);
	}
}

public class Assign3multilevelintrfacesdemo {

	public static void main(String[] args) {
		Riseengclg1 obj=new Riseengclg1 ();
		obj.showclgname("RISE");
		obj.showaddress("ONGOLE");
		obj.showbranches("ECE");

	}

}
