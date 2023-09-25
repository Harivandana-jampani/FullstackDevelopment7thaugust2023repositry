/* 
11
198
180
162
144
126
108
90
72
54
36
18
*/
package com.gentech.Arrays;


public class Divisibleby3and6and9 {

	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=200;i++)
		{
            if((i%3==0)&&(i%6==0)&&(i%9==0))
            {
            	count=count+1;
            }
		}
		System.out.println(+count);
		int a[]=new int [count];
		int k=0;
		for(int j=1;j<=200;j++)
		{
			if((j%3==0)&&(j%6==0)&&(j%9==0))
			{
				a[k]=j;
				k++;
			}
		}
		for(int z=(a.length-1);z>=0;z--)
		{
			System.out.println(a[z]);
		}
 


	}

}
