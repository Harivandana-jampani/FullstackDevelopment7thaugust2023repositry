package com.gentech.Interfacedemo;
interface College
{
	void showclgname(String name);
}
interface Address extends College
{
	void showaddress(String Address);
}
interface Branches extends Address
{
	void showbranches(String branches);
}
interface faculty extends Branches
{
	void showfaculty(String faculty );
}
 class Riseengclg implements faculty
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
	public void showfaculty(String faculty)
	{
		System.out.println("faculty:"+faculty);
	}	
}

public class Assign1morethan3mulinheritence {

	public static void main(String[] args) {
		Riseengclg obj=new Riseengclg();
		obj.showclgname("RISE");
		obj.showaddress("ONGOLE");
		obj.showbranches("ECE");
		obj.showfaculty("ASHOK");	
	}

}
