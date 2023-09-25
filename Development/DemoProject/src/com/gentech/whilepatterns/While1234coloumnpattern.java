/* 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
*/
package com.gentech.whilepatterns;

public class While1234coloumnpattern {

	public static void main(String[] args) {
		int i=5;
		while(i>=1)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print(j+" ");
				j++;
			}
			System.out.println( );
			i--;
		
		}


	}

}
