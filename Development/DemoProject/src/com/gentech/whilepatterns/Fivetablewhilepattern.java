/* 
 5 
10 15 
20 25 30 
35 40 45 50 
55 60 65 70 75 
*/
package com.gentech.whilepatterns;

public class Fivetablewhilepattern {

	public static void main(String[] args) {
		int i=1;
		int count=1;
		while(i<=5)
		{
			int k=1;
			while(k<=i)
			{
				System.out.print(count*5+" ");
				count++;
				k++;
			}
			System.out.println( );
			i++;
		}


	}

}
