/*
1 
4 9 
16 25 36 
49 64 81 100 

*/
package com.gentech.whilepatterns;

public class Squarewhilepatterndemo {

	public static void main(String[] args) {
		int i=1;
		int count=1;
		while(i<=4)
		{
			int k=1;
			while(k<=i)
			{
				System.out.print(count*count+" ");
				count++;
				k++;
			}
			System.out.println( );
			i++;
		}


	}

}
