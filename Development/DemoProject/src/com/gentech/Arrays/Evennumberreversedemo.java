/* 
11
80
78
76
74
72
70
68
66
64
62
60
*/

package com.gentech.Arrays;

public class Evennumberreversedemo {

	public static void main(String[] args) {
		int count=0;
		for(int i=60;i<=80;i++)
		{
            if(i%2==0)
            {
            	count=count+1;
            }
		}
		System.out.println(count);
		int a[]=new int [count];
		int k=0;
		for(int j=60;j<=80;j++)
		{
			if(j%2==0)
			{
				a[k]=j;
				k++;
			}
		}
		for(int z=a.length-1;z>=0;z--)
		{
			System.out.println(a[z]);
		}
 
	}

}
