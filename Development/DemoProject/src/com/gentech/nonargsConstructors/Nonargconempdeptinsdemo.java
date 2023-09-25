package com.gentech.nonargsConstructors;
class Emp
{
	int empno;
	String empfirstname;
	String emplastname;
	String empemail;
	Emp()
	{
		empfirstname="harivandana";
		emplastname="jampani";
		empno=1;
		empemail="harivandana.jampani@gmail.com";
		System.out.println(empfirstname);
		System.out.println(emplastname);
		System.out.println(empemail);
		System.out.println(empno);
		System.out.println("+++++++");
	}
}
class Dept
{
	String deptname;
	int deptno;
	String address;	
	Dept()
	{
		deptname="software";
		deptno=10;
		address="banglore";
		System.out.println(deptname);
		System.out.println(deptno);
		System.out.println(address);
		System.out.println("+++++++++++");
	}
}
class insurence
{
	int insid;
	String instype;
	int amount;
	String name;
	insurence()
	{
		insid=20;
		instype="carinsurence";
		name="priya";
		amount=10000;
		System.out.println(insid);
		System.out.println(instype);
		System.out.println(name);
		System.out.println(amount);
	}
}
public class Nonargconempdeptinsdemo {
	public static void main(String[] args) {
		Emp hari=new Emp();
		Dept ece=new Dept();
		insurence insure=new insurence();
	}

}
