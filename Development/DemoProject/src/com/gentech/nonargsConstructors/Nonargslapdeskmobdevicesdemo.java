package com.gentech.nonargsConstructors;
class Desktop
{
	int desktopid;
	String Desktopname;
	int  version;
	int noofdesktops;
	int ram;
	int storage;
	Desktop()
	{
		desktopid=10;
		Desktopname="dell";
		storage=126;
		ram=8;
		version=5;
		System.out.println(desktopid);
		System.out.println(Desktopname);
		System.out.println(storage);
		System.out.println(ram);
		System.out.println(version);
		System.out.println("++++++++++");	
	}

}
class Laptop
{
	int laptopid;
	String Laptopname;
	int version;
	int nooflaptops;
	int ram;
	int storage;	
	Laptop()
	{
		laptopid=10;
		Laptopname="dell";
		storage=126;
		ram=8;
		version=5;
		System.out.println(laptopid);
		System.out.println(Laptopname);
		System.out.println(storage);
		System.out.println(ram);
		System.out.println(version);
		System.out.println("++++++++++");
	}
}
class Mobiledevices
{
	int mobileid;
	String mobilename;
	int version;
	int noofmobiles;
	int ram;
	int storage;
	Mobiledevices()
	{
		mobileid=10;
		mobilename="oneplus";
		storage=126;
		ram=8;
		version=10;
		System.out.println(mobileid);
		System.out.println(mobilename);
		System.out.println(storage);
		System.out.println(ram);
		System.out.println(version);
	}
}
public class Nonargslapdeskmobdevicesdemo {

	public static void main(String[] args) {
		Desktop desktops=new Desktop();
		Laptop lap=new Laptop();
		Mobiledevices mobile=new Mobiledevices();

	}

}
