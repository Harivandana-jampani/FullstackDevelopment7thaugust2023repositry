/* 
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
*/
package Dowhilepatterns;

public class Count123dowhilepattern {

	public static void main(String[] args) {
		int i=1;
		int count =1;
		do
		{
			int j=1;
			do
			{
				System.out.print(count+" ");
				j++;
				count++;
				
			}while(j<=i);
			System.out.println( );
			i++;
		}while(i<=5);

	}

}
