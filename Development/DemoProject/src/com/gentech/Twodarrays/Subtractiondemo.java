/* 
 -1 -1 -1 
-1 -1 -1 
-1 -1 9 
 */
package com.gentech.Twodarrays;

public class Subtractiondemo {

	public static void main(String[] args) {
		int x[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int y[][]= {{2,3,4},{5,6,7},{8,9,0}};
		if((x.length==y.length)&&(x[0].length==y[0].length))
		{
			for(int i=0;i<x.length;i++)
			{
				for(int j=0;j<x[i].length;j++)
				{
					int res=x[i][j]-y[i][j];
					System.out.print(res+" ");
				}
				System.out.println( );
			}
		}

	}

}
