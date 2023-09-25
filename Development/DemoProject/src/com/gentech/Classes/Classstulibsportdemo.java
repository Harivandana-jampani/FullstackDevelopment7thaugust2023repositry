package com.gentech.Classes;
class Student
{
	int studid;
	String studfirstname;
	String studlastname;
	String studemail;
	long studmobileno;	
}
class Library
{
	int libid;
	String libname;
	int noofbooks;
	String clgname;
}
class Sports
{
	int sportid;
	String sportname;
	int noofplayers;
	String coachname;	
}

public class Classstulibsportdemo {

	public static void main(String[] args) {
		Student vandhu=new Student();
		vandhu.studfirstname="vardhan";
		vandhu.studlastname="tulluri";
		vandhu.studemail="vardhan@gmail.com";
		vandhu.studid=20;
		vandhu.studmobileno=863906200;
		System.out.println(vandhu.studfirstname);
		System.out.println(vandhu.studlastname);
		System.out.println(vandhu.studemail);
		System.out.println(vandhu.studid);
		System.out.println(vandhu.studmobileno);
		System.out.println("+++++++");
		Library lib=new Library();
		lib.libid=203;
		lib.libname="digital library";
		lib.noofbooks=1000;
		lib.clgname="rise";
		System.out.println(lib.libid);
		System.out.println(lib.libname);
		System.out.println(lib.noofbooks);
		System.out.println(lib.clgname);
		System.out.println("+++++++++++");
		Sports sport=new Sports();
		sport.sportid=100;
		sport.sportname="cricket";
		sport.noofplayers=11;
		sport.coachname="virat";
		System.out.println(sport.sportid);
		System.out.println(sport.sportname);
		System.out.println(sport.noofplayers);
		System.out.println(sport.coachname);
	}

}
