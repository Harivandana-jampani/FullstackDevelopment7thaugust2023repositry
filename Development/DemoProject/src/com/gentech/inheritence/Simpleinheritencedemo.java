//ASSIGNMENT 1
package com.gentech.inheritence;
class Arithmetic
{
	void Average(int x,int y,int z)
	{
		System.out.println("average:"+(x+y+z)/2);
	}
}
class Arithmetic1 extends Arithmetic
{
	void Sum(int a,int b,int c,int d,int e)
	{
		System.out.println("sum:"+(a+b+c+d+e));
	}
}

public class Simpleinheritencedemo {

	public static void main(String[] args) {
		Arithmetic1 obj=new Arithmetic1();
		obj.Average (10,20,30);
		obj.Sum (1,2,3,4,5);	

	}

}
