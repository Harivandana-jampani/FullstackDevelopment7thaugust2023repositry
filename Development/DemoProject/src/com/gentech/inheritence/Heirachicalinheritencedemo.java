//ASSIGNMENT 2
package com.gentech.inheritence;
class Mathsop
{
	void Mean(int x,int y,int z,int p,int d)
	{
		System.out.println("mean:"+(x+y+z+p+d)/5);
	}
}
class Mathsop1 extends Mathsop
{
	void Simpleinterest(int p,int r,int t)
	{
		System.out.println("si:"+(p*t*r)/100);
	}
}
class Mathsop2 extends Mathsop
{
	void Squareperimeter(int s)
	{
		System.out.println("sqperimeter:"+4*s);
	}
}

public class Heirachicalinheritencedemo {

	public static void main(String[] args) {
		Mathsop2 obj1=new Mathsop2();
		obj1.Squareperimeter(10);
		obj1.Mean(10,20,30,40,50);                                                             
		
		Mathsop1 obj2=new Mathsop1();
		obj2.Simpleinterest(10,25,15);
		obj2.Mean(10,20,30,40,50);

	}

}
