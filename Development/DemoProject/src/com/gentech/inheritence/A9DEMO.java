package com.gentech.inheritence;
class superclass1
{
	superclass1(int x)
	{
		System.out.println("superclass constructor1: x="+x);
	}
	superclass1(int x,String y)
	{
		System.out.println("superclass constructor2: x="+x+" y="+y);
	}
	superclass1(String y)
	{
		System.out.println("superclass constructor3: y="+y);
	}
}
class subclass1 extends superclass1
{
	subclass1(int x)
	{
		super(x);
	}
	subclass1(int x,String y)
	{
		super(x,y);
	}
	subclass1(String y)
	{
		super(y);
	}
}
class subclass2 extends subclass1
{
	subclass2(int x)
	{
		super(x);
	}
	subclass2(int x,String y)
	{
		super(x,y);
	}
	subclass2(String y)
	{
		super(y);
	}
}
class subclass3 extends superclass1
{
	subclass3(int x)
	{
		super(x);
	}
	subclass3(int x,String y)
	{
		super(x,y);
	}
	subclass3(String y)
	{
		super(y);
	}
}

public class A9DEMO {

	public static void main(String[] args) {
		subclass1 obj=new subclass1(10);
		subclass1 obj1=new subclass1(10,"Priya");
		subclass1 obj2=new subclass1("Priya");
	}

	}
