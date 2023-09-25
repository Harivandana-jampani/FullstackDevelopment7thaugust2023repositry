package com.gentech.Polymorphism;
abstract class Animal
{
	abstract void sound();
}
class Dog extends Animal
{
	void sound()
	{
		String Soundname="bow";
		System.out.println("sound of dog:"+Soundname);
	}
}
class Cat extends Animal
{
	void sound()
	{
		String Soundname="meow";
		System.out.println("sound of cat:"+Soundname);
	}
}
class Bee extends Animal
{
	void sound()
	{
		String Soundname="buzz";
		System.out.println("sound of bee:"+Soundname);
	}
}

public class Assign3animalsounddemo {

	public static void main(String[] args) {
		Animal animals=null;
		Cat cats=new Cat();
		Dog dogs=new Dog();
		Bee bees=new Bee();
		animals=cats;
		animals.sound();
		animals=dogs;
		animals.sound();
		animals=bees;
		animals.sound();	
	}

}
