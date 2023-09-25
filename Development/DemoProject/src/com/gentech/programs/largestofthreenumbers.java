package com.gentech.programs;

public class largestofthreenumbers {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		
		if((a>b)&&(a>c))
		{
			System.out.println("a is greater");
		}
		else if((b>a)&&(b>c))
		{
			System.out.println("b is greater");
		}
		else if((c>a)&&(c>b))
		{
			System.out.println("c is greater");
		}
		else 
		{
			System.out.println("invalid");
	     }
}
		
}
