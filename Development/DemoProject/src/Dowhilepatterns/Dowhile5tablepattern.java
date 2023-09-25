/*
5 
10 15 
20 25 30 
35 40 45 50 
55 60 65 70 75
*/ 
package Dowhilepatterns;

public class Dowhile5tablepattern {

	public static void main(String[] args) {
		int i=1;
		int count =1;
		do
		{
			int j=1;
			do
			{
				System.out.print(count*5+" ");
				j++;
				count++;
				
			}while(j<=i);
			System.out.println( );
			i++;
		}while(i<=5);

	}

}
