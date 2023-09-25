package com.gentech.inheritence;
class College1
{
	String name;
	void show(String name)
	{
		System.out.println("clg name in super class:"+name);
	}
}
class Branch1 extends College1
{
	Branch1(String name)
	{
		super.name=name;
	}
	String name;

	void display1(String name)
	{
		System.out.println("Branch name in sub class:"+name);
	}
}
class Students1 extends Branch1
{
		Students1(String name)
		{
			super(name);
			super.name=name;
		}
		String name;
		void display2(String name)
		{
			System.out.println("Student name in subclass:"+name);
		}
	}
public class A2demo {

	public static void main(String[] args) {
		Students1 obj=new Students1("nagraj");
		obj.display1("aadhrika");
		obj.show("aadityaa");
		obj.display2("aadyaa");

	}

}
