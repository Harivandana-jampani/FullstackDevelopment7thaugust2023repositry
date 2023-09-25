package com.gentech.Constructoroverloadingdemo;
class Student
{
	Student(String Studfname,String email,String studlname)
	{
		System.out.println("studentname:"+Studfname);
		System.out.println("studentmail:"+email);
		System.out.println("studname:"+studlname);

	}
	Student(int rollno)
	{
		System.out.println("rollno:"+rollno);
	}
	Student(long mobileno)
	{
		System.out.println("mobileno:"+mobileno);
	}
}

public class Studentconstoverloadingdemo {

	public static void main(String[] args) {
		Student obj1=new Student("vandana","hari@gmail.com","jampani");
		Student obj2=new Student(17);
		Student obj3=new Student(639062400);
	}

}
