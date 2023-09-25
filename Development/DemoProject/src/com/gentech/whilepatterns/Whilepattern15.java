/*
15 14 13 12 11 
10 9 8 7 
6 5 4 
3 2 
1 
*/
package com.gentech.whilepatterns;

public class Whilepattern15 {

	public static void main(String[] args) {
		int i=5;
		int count =15;
		while(i>=1)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print(count+" ");
				j++;
				count--;
			}
			System.out.println( );
			i--;
		
		}


	}

}
