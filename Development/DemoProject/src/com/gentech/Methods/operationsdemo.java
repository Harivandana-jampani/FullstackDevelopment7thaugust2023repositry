package com.gentech.Methods;
class Andornot
{
	void Andop(int x,int y)
	{
		boolean z=((x<y)&&(y<x));
		System.out.println(z);
	}
	void Orop(int x,int y)
	{
		boolean z=((x<y)||(y<x));
		System.out.println(z);
	}
	void notop(int x,int y)
	{
		Boolean z=!((x>y)||(y<x));
		System.out.println(z);
	}

}
public class operationsdemo {

	public static void main(String[] args) {
		Andornot obj=new Andornot();
		obj.Andop(5, 3);
		obj.Orop(5, 3);
		obj.notop(5, 3);
	}

}
