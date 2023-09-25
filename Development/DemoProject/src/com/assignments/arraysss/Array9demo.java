package com.assignments.arraysss;

public class Array9demo {

	public static void main(String[] args) {
		int x[]=new int [10];
		int k=0;
		for(int i=1;i<=x.length/2;i++)
		{
			x[k]=i;
			k++;
		}
		for(int z=0;z<x.length/2;z++)
		{
			System.out.println(x[z]*8);
		}
	}

}
