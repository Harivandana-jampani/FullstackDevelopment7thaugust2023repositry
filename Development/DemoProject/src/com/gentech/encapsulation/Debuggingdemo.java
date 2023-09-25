package com.gentech.encapsulation;
class Maths1
{
	static Maths1 obj=null;
	private Maths1()
	{
		// it is private constructor
	}
	void addition(int x,int y)
	{
		int res=(x+y);
		System.out.println("addition result:"+res);
	}
	void multiplication(int x,int y)
	{
		int res=(x*y);
		System.out.println(" result:"+res);
	}
	public static Maths1 getInstance()
	{
		if(obj==null)
		{
			obj=new Maths1();
		}
		return obj;
	}
}

public class Debuggingdemo {

	public static void main(String[] args) {
		Maths1 o1=Maths1.getInstance();
		o1.addition(10,20);
		o1.multiplication(5, 10);
		Maths1 o2=Maths1.getInstance();
		o2.addition(10,30);
		o2.multiplication(5, 15);
		Maths1 o3=Maths1.getInstance();
		o3.addition(10,30);
		o3.multiplication(5, 20);
	}

}
