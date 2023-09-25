package com.gentech.abstractdemo;
abstract class Library
{
	 String Bookname;
	Library()
	{
		Bookname="you can win";
		System.out.println("bookname:"+Bookname);
	}
	void showLibrary()
	{
		
	}
}
class Library2 extends Library
{
	
}
public class Nonargsdemo {

	public static void main(String[] args) {
		Library2 obj=new Library2();
		
		

	}

}
