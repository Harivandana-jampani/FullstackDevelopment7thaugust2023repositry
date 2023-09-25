/* 
5 5 5 5 5 
5 5 5 5 
5 5 5 
5 5 
5
*/
package com.gentech.whilepatterns;


public class While5patterndemo {

	public static void main(String[] args) {
		int i=5;
		while(i>=1)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print(5+" ");
				j++;
			}
			System.out.println( );
			i--;
		
		}


	}

}
