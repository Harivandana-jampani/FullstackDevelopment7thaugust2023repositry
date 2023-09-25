package com.assignments.arraysss;

public class Array11demo {

	public static void main(String[] args) {
		int x[][]= {{1,2,3},{4,5,6}};
		for(int i=x.length-1;i>=0;i--)
		{
			for(int j=x[i].length-1;j>=0;j--)
			{
				System.out.println(x[i][j]);
			}
		}

	}

}
