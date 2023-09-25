package com.assignments.arraysss;

public class Array6demo {

	public static void main(String[] args) {
		int count=0;
		for(int i=10;i<=50;i++)
		{
			if(i%2==0)
			{
				count++;
			}
		}
		System.out.println(count);
		int x[]=new int[count];
		int k=0;
		for(int j=10;j<=50;j++)
		{
			if(j%2==0)
			{
				x[k]=j;
				k++;
			}
		}
		for(int z=x.length-1;z>=0;z--)
		{
			System.out.println(x[z]);
		}
	}

}
