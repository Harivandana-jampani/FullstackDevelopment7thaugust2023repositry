package com.gentech.Interfacedemo;
interface company
{
	void showdetails(String companyname,String empname,String address,String Departments);
	
}
interface Company1
{
	void showdetails1(int empid,int salary,int noofemp,int noofdepts);
	
}
class Infosysdetails implements Company1
{
	public void showdetails(String companyname,String empname,String address,String Departments)
	{
		System.out.println("companyname:"+companyname);
		System.out.println("empname:"+empname);
		System.out.println("address:"+address);
		System.out.println("departments:"+Departments);
		System.out.println("++++++++++++");
	}
	public void showdetails1(int empid,int salary,int noofemp,int noofdepts)
	{
		System.out.println("empid:"+empid);
		System.out.println("empsal:"+salary);
		System.out.println("noofemp:"+noofemp);
		System.out.println("noofdepts:"+noofdepts);
	}
}
public class Assign23moreintrfacevariables {

	public static void main(String[] args) {
		Infosysdetails obj=new Infosysdetails();
		obj.showdetails("infosys","vandhu","banglore","frontend developer");
		obj.showdetails1(11,300000,2000,100);

	}

}
