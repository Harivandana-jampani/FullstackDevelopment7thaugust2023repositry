package com.gentech.abstractdemo;
abstract class Sports1
{
	static void showsport1(String sportname)
	{
		System.out.println("sport name in abstract class1:"+sportname);
	}
	static void showsport2(String coachname)
	{
		System.out.println("coachname in abstract class:"+coachname);
	}
	static void showsport3(int noofplayers)
	{
		System.out.println("noof players in abstract class:"+noofplayers);
	}
}
class Sports2 extends Sports1
{
	
}
public class Staticmethodsdemo {

	public static void main(String[] args) {
		Sports2 obj=new Sports2();
		obj.showsport1("cricket");
		obj.showsport2("surya");
		obj.showsport3(11);

	}

}
