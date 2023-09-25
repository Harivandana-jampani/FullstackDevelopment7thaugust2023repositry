package com.gentech.Methods;
class Numbers
{
	void Forloop(int i)
	{
		for(i=50;i>=40;i--)
		{
			System.out.println(i);
		}
		System.out.println("++++++++++");
	}
	void Whileloop(int j)                                                                                                                                                                                                                                                                              
	{
		j=50;
		while(j>=40)
		{
			System.out.println(j);
			j--;
		}
		System.out.println("++++++++++");
	}
	void Dowhileloop(int k)
	{
		k=50;
		do
		{
			if(k>=40)
			{
				System.out.println(k);
			}
			k--;
		}while(k>=40);

	}

}

public class Printingvaluesemo {

	public static void main(String[] args) {
		Numbers obj=new Numbers();
		obj.Forloop(50);
		obj.Whileloop(50);
		obj.Dowhileloop(50);

	}

}
