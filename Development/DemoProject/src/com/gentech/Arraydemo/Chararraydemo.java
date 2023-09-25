package com.gentech.Arraydemo;


class demo1
{
	
	char [] array1(char ch[])
	{
		int k=0;
		char b[]=new char[ch.length];
		for(int i=0;i<=ch.length;i++)
		{
			b[k]=ch[i];
			k++;
		}		
	return b;
	}
}
public class Chararraydemo {

	public static void main(String[] args) {
		char x[]={'v','a','n','d','h','u'};
		
		demo1 d=new demo1();
		char a[]=d.array1(x);
		for(char i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}

