package com.gentech.Methods;
class Vowelornot
{
	void vowel(char ch)
	{
		switch(ch)
		{
		case 'a':case 'A':
			System.out.println("vowel:"+ch);
			break;
		case 'e':case 'E':
			System.out.println("vowel:"+ch);
			break;
		case 'i':case 'I':
			System.out.println("vowel:"+ch);
			break;
		case 'o':case 'O':
			System.out.println("vowel:"+ch);
			break;
		case 'u':case 'U':
			System.out.println("vowel:"+ch);
			break;
		default:
			System.out.println("consonant:");
		}

	}
	void array(char ch[][])
	{
		for(int i=ch.length-1;i>=0;i--)
		{
			for(int j=ch[i].length-1;j>=0;j--)
			{
				System.out.print(ch[i][j]);

			}
			System.out.println();
		}
	}
	void Reverse(int x[])
	{
		int y[]=new int[x.length];
		int k=0;
		{
			for(int i=0;i<x.length;i++)
			{
				y[i]=x[i];
				k++;

			}

			for(int j=(y.length-1)/2;j>=0;j--) {

				System.out.print(y[j]+" ");
			}
		}
	}
}

public class vowelornotmethoddemo {

	public static void main(String[] args) {
		Vowelornot obj1=new Vowelornot();
		obj1.vowel('v');
		obj1.vowel('a');
		obj1.vowel('s');
		char ch[][]= {{'a','s','d'},{'w','r','t'}};
		obj1.array(ch);
		int x[]= {10,20,30,40};
		obj1.Reverse(x);
	}

}

