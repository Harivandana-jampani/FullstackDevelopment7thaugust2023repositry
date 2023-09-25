package com.gentech.inheritence;
class Student
{
	String name;
	void showStudname(String Studname)
	{
		System.out.println("the student name in parent class:"+Studname);
	}
}
class Student1 extends Student
{
	Student1(String Branchname)
	{
		super.name=name;
	}
	String name;
	void showStudname(String Studname)
	{
		System.out.println("the student name in child class:"+Studname);
	}
}
class Student2 extends Student1
{
	Student2(String facultyname)
	{
		super(facultyname);
		super.showStudname(facultyname);	

	}
	String name;
	void showStudname(String facname)
	{
		System.out.println("the student name in child class:"+facname);
	}
}

public class A3demo {

	public static void main(String[] args) {
		Student obj=new Student2("shammi");
		obj.showStudname("aadyaa");
		obj.showStudname("aadhrika");


	}

}
