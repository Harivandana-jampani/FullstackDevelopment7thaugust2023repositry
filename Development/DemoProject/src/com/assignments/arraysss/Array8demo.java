package com.assignments.arraysss;

public class Array8demo {

	public static void main(String[] args) {
		int x[]=new int[10];
		int k=0;
		for(int i=1;i<=10;i++)
		{
			x[k]=i;
			k++;
		}
	for(int z=x.length/2;z<=x.length-1;z++)
	{
		System.out.println(x[z]*x[z]);
	}

}
}
