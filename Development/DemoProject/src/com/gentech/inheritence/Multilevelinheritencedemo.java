//ASSIGNMENT 4 
package com.gentech.inheritence;
class Maths
{
	void sqarea(int s)
	{
		System.out.println("square area:"+s*s);
	}
}
class Maths1 extends Maths
{
	void rectperimeter(int l,int b)
	{
		System.out.println("rectperimeter:"+2*(l+b));
	}
}
class Maths2 extends Maths1
{
	void rectarea(int l,int b)
	{
		System.out.println("rectarea:"+l*b);
	}
}

public class Multilevelinheritencedemo {

	public static void main(String[] args) {
		Maths2 obj=new Maths2();
		obj.rectarea(10,25);
		obj.rectperimeter(25,10);
		obj.sqarea(100);	

	}

}
