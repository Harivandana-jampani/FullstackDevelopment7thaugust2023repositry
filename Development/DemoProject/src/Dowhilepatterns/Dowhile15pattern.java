/*
15 14 13 12 11 
10 9 8 7 
6 5 4 
3 2 
1 
 */
 package Dowhilepatterns;
 

public class Dowhile15pattern {

	public static void main(String[] args) {
		int i=5;
		int count=15;
		do
		{
			int k=1;
			do
			{
				System.out.print(count+" ");
				k++;
				count--;
			}while(k<=i); 
			System.out.println();
			i--;
		}while(i>=1);			

		
	}

}
