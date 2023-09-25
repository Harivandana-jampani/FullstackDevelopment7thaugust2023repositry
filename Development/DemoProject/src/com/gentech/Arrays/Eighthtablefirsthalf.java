/* 
10
8
16
24
32
40
48
56
64
72
80
 */
 package com.gentech.Arrays;

public class Eighthtablefirsthalf {

	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=10;i++)
		{
            	count=count+1;
		}
		System.out.println(count);
		int a[]=new int [count];
		int k=0;
		for(int j=1;j<=10;j++)
		{
				a[k]=j;
				k++;
			}
		for(int z=0;z<=a.length-1;z++)
		{
			System.out.println(a[z]*8);
		}
 
	}

}
