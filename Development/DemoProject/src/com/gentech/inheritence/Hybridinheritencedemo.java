//ASSIGNMENT 3
package com.gentech.inheritence;
class HybridMaths1
{
	void Triangle(int l,int b)
	{
		System.out.println("trianglearea:"+(l*b)/2);
	}
}
class HybridMaths2 extends HybridMaths1
{
	void circle(int r)
	{
		System.out.println("circle circumference:"+(2*3.14*r));
	}
}
class HybridMaths3 extends HybridMaths2
{
	void cylindervolume(int r,int h)
	{
		System.out.println("cylinder volume:"+(3.14*r*r*h));
	}
}
class HybridMaths4 extends HybridMaths1
{
	void Conevolume(int r,int h)
	{
		System.out.println("cone volume:"+(3.14*r*r*h)/3);
	}
}

public class Hybridinheritencedemo {

	public static void main(String[] args) {
		HybridMaths3 obj1=new HybridMaths3();
		obj1.Triangle(2,4);
		obj1.circle(10);
		obj1.Triangle(2,25);
		HybridMaths4 obj2=new HybridMaths4();
		obj1.Triangle(2,25);
		obj2.Conevolume(30, 10);	
	}

}
