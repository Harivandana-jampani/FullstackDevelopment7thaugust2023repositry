package com.gentech.Voidmethod;
class number1 
{
	void sumPrime(int x, int y) 
	{
		int sum = 0;
		for (int i = x; i <= y; i++) 
		{
			int k = 1;
			for (int j = 2; j < i; j++) 
			{
				if (i % j == 0) 
				{
					k = k + 1;
					break;
				}
			}
			if (k == 1) 
			{
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}

class number2
{
	void countPrimes(int a, int b) 
	{
		int count = 0;
		for (int i = a; i <= b; i++)
		{
			int k = 1;
			for (int j = 2; j < i; j++) 
			{
				if (i % j == 0) {
					k = k + 1;
					break;
				}
			}
			if (k == 1) {
				count++;
			}
		}
		System.out.println(count);
	}
}

class number3{
	void isprime(int a,int b)
	{
		for(int i=a;i<=b;i++)
		{
			int k=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					k=k+1;
					break;
				}
			}
			if(k==0)
			{
				System.out.println(i);
			}
		}

	}
}

class number4
{
	void isprime(int a,int b)
	{
		for(int i=a;i>=b;i--)
		{
			int k=1;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					k=k+1;
					break;
				}
			}
			if(k==1)
			{
				System.out.println(i);
			}
		}
	}
}
public class Voidprimedemo {

	public static void main(String[] args) {

		number1 o1 = new number1();
		o1.sumPrime(100, 200);

		number2 o2 = new number2();
		o2.countPrimes(150, 300);

		number3 o3 = new number3();
		o3.isprime(1,50);

		number4 o4 = new number4();
		o4.isprime(100,50);

	}

}

