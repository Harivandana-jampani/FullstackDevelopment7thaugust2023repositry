package com.gentech.Constructoroverloadingdemo;
class Books
{
	Books(String Bookname,String author,String publishers)
	{
		System.out.println("bookname:"+Bookname);
		System.out.println("author:"+author);
		System.out.println("publishers:"+publishers);
	}
	Books(int booknum)
	{
		System.out.println("booknum:"+booknum);
	}
}
public class Booksconstoverloadingdemo {

	public static void main(String[] args) {
		Books obj1=new Books("stld","vijay","sv");
		Books obj2=new Books(11);


	}

}
