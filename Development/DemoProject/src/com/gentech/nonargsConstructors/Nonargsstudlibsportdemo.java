package com.gentech.nonargsConstructors;

class Student
{
	int studid;
	String studfirstname;
	String studlastname;
	String studemail;
	long studmobileno;
	Student()
	{
		studfirstname="vardhan";
		studlastname="tulluri";
		studemail="vardhan@gmail.com";
		studid=20;
		studmobileno=863906200;
		System.out.println(studfirstname);
		System.out.println(studlastname);
		System.out.println(studemail);
		System.out.println(studid);
		System.out.println(studmobileno);
	}
}
class Library
{
	int libid;
	String libname;
	int noofbooks;
	String clgname;
	Library()
	{
		libid=203;
		libname="digital library";
		noofbooks=1000;
		clgname="rise";
		System.out.println(libid);
		System.out.println(libname);
		System.out.println(noofbooks);
		System.out.println(clgname);
		System.out.println("+++++++++++");
	}
}
class Sports
{
	int sportid;
	String sportname;
	int noofplayers;
	String coachname;
	Sports()
	{
		sportid=100;
		sportname="cricket";
		noofplayers=11;
		coachname="virat";
		System.out.println(sportid);
		System.out.println(sportname);
		System.out.println(noofplayers);
		System.out.println(coachname);
	}
}

public class Nonargsstudlibsportdemo {

	public static void main(String[] args) {
		Student vandhu=new Student();
		Library lib=new Library();
		Sports sport=new Sports();

	}

}
