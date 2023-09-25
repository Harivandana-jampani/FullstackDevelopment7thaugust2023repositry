/* 
   90 80 70 
60 50 40 
30 20 10 
 */
package com.gentech.Twoarray;

public class Reverseorder {

	public static void main(String[] args) {
		int x[][]= {{10,20,30},{40,50,60},{70,80,90}};
		for(int i=x.length-1;i>=0;i--)
		{
			for(int j=x[i].length-1;j>=0;j--)
			{
				System.out.print(x[i][j]+" ");
			}
		System.out.println();
		}

	}

}
