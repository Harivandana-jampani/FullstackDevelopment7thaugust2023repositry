/* 
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
*/
package com.gentech.whilepatterns;

public class Count1234whilepattern {

	public static void main(String[] args) {
		int i=1;
		int count=1;
		while(i<=5)
		{
			int k=1;
			while(k<=i)
			{
				
				System.out.print(count+" ");
				count++;
				k++;
				
			}
			System.out.println( );
			i++;
		}


	}

}
