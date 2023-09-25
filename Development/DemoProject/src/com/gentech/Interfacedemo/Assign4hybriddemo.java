package com.gentech.Interfacedemo;
interface library
{
	void showlibrary(String libname);
}
interface sports extends library
{
	void showsports(String sportname);
	
}
interface canteen extends sports
{
	void showcanteen(String canname);
}
interface labs extends canteen
{
	void showlabs(String labs);
}
class Clg2 implements canteen
{
	public void showlibrary(String libname)
	{
		System.out.println("libraryname:"+libname);
	}
	public void showsports(String sportname)
	{
		System.out.println("sportname:"+sportname);
	}
	public void showcanteen(String canname)
	{
		System.out.println("canteenname:"+canname);
	}
}
class Clg1 implements labs
{
	public void showlibrary(String libname)
	{
		System.out.println("libraryname:"+libname);
	}
	public void showsports(String sportname)
	{
		System.out.println("sportname:"+sportname);
	}
	public void showcanteen(String canname)
	{
		System.out.println("canteenname:"+canname);
	}
	public void showlabs(String labs)
	{
		System.out.println("labname:"+labs);
	}
}
public class Assign4hybriddemo {

	public static void main(String[] args) {
		Clg2 obj1=new Clg2();
		obj1.showlibrary("digital");
		obj1.showsports("kabbadi");
		obj1.showcanteen("vit");
		System.out.println("++++++++++++");
		Clg1 obj=new Clg1();
		obj.showlibrary("technohub");
		obj.showsports("cricket");
		obj.showcanteen("rise");
		obj.showlabs("edc");	
	}

}
