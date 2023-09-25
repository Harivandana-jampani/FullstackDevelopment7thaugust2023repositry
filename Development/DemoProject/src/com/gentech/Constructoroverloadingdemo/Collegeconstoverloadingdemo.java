package com.gentech.Constructoroverloadingdemo;
class College
{
	College(String Clgname,String Location,String Branches,String clgemail)
	{
		System.out.println("Clgname:"+Clgname);
		System.out.println("location:"+Location);
		System.out.println("Branches:"+Branches);
		System.out.println("clgemail:"+clgemail);
	}
	College(int clgid)
	{
		System.out.println("clgid:"+clgid);
	}
	College(long mobileno)
	{
		System.out.println("mobileno:"+mobileno);
	}

}

public class Collegeconstoverloadingdemo {

	public static void main(String[] args) {
		College obj=new College(8);
		College obj1=new College(1234567890);
		College obj2=new College("rise","ongole","ece,eee,cse,civil,mech","rise@gmail.com");

	}

}
