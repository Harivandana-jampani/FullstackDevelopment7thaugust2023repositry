/* 
15 14 13 12 11 
10 9 8 7 
6 5 4 
3 2 
1 

*/
package com.gentech.Forpatterns;

public class Reverse15to1fordemo {

	public static void main(String[] args) {
		int count=15;
		for(int i=5;i>=1;i--)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(count+" ");
				count--;
			}
			System.out.println();
		}

	}

}
