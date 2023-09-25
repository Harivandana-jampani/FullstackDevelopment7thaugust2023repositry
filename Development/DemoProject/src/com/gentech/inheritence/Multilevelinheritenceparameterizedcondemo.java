//ASSIGNMENT 5
package com.gentech.inheritence;
class Student5
{
	Student5(String firstname,String lastname,int Rollno)
	{
		System.out.println("First Name is:"+firstname);
		System.out.println("Last Name is :"+lastname);
		System.out.println("Roll Number is :"+Rollno);
	}
}

class Student21 extends Student5
{
	Student21(String fn,String Ln,int rollnumber)
	{
		super(fn,Ln,rollnumber);
	}
}

class Student3 extends Student21
{
	Student3(String fn,String Ln,int rollnumber)
	{
		super(fn,Ln,rollnumber);
	}
}
public class Multilevelinheritenceparameterizedcondemo {

	public static void main(String[] args) {
		Student3 o1=new Student3("vandana","jampani",2);


	}

}
