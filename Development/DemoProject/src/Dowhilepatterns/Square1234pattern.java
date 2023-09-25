/* 
1 
4 9 
16 25 36 
49 64 81 100 
121 144 169 196 225
*/ 
package Dowhilepatterns;

public class Square1234pattern {

	public static void main(String[] args) {
		int i=1;
		int count =1;
		do
		{
			int j=1;
			do
			{
				System.out.print(count*count+" ");
				j++;
				count++;
				
			}while(j<=i);
			System.out.println( );
			i++;
		}while(i<=5);
	}

}
