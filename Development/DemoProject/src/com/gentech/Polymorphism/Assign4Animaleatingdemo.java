package com.gentech.Polymorphism;
abstract class Animals
{
	abstract void eating();
}
class Cow extends Animals
{
	void eating()
	{
		String typeoffood="grass";
		System.out.println("cow eats:"+typeoffood);
	}
}
class lion extends Animals
{
	void eating()
	{
		String typeoffood="meet";
		System.out.println("lion eats:"+typeoffood);
	}
}
class tiger extends Animals
{
	void eating()
	{
		String typeoffood="meet";
		System.out.println("tiger eats:"+typeoffood);
	}
}
public class Assign4Animaleatingdemo {

	public static void main(String[] args) {
		Animals animals=null;
		Cow cows=new Cow();
		lion lions=new lion();
		tiger tigers=new tiger();
		animals=cows;
		animals.eating();
		animals=lions;
		animals.eating();
		animals=tigers;
		animals.eating();		
	}

}
