/* 
17
150
144
138
132
126
120
114
108
102
*/
package com.gentech.Arrays;

public class Divisibleby6array {

	public static void main(String[] args) {
		int count=0;
		for(int i=100;i<=200;i++)
		{
            if(i%6==0)
            {
            	count=count+1;
            }
		}
		System.out.println(count);
		int a[]=new int [count];
		int k=0;
		for(int j=100;j<=200;j++)
		{
			if(j%6==0)
			{
				a[k]=j;
				k++;
			}
		}
		for(int z=(a.length-1)/2;z>=0;z--)
		{
			System.out.println(a[z]);
		}
 
	}

}
