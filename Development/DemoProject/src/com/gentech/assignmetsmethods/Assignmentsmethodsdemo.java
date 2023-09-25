package com.gentech.assignmetsmethods;
//Byte array second half of the elements
class Byteoned
{
	void bytearray(byte b[])
	{
		for(int i=b.length/2;i<=b.length-1;i++)
		{
			System.out.print(b[i]);
		}
		System.out.println("+++++++");
	}
	//short array first half of the elements
	void shortarray(short s[])
	{
		for(int i=0;i<s.length/2;i++)
		{
			System.out.print(s[i]);
		}
		System.out.println("+++++++");
	}
	//integer array first half of elements
	void intarray(int p[])
	{
		for(int i=(p.length/2)-1;i>=0;i--)
		{
			System.out.print(p[i]);
		}
		System.out.println("+++++++");
	}
	//string array elements in reverse order
	void stringarray(String st[])
	{
		for(int i=st.length-1;i>=0;i--)
		{
			System.out.print(st[i]);
		}
		System.out.println("+++++++");
	}
	//integer array sum of the all elements
	void intsumarr(int t[],int sum)
	{
		for(int i=0;i<t.length;i++)
		{
			sum=sum+t[i];
		}
		System.out.println(sum);
	}
	//character array display vowels sepertely // test 
	void dispvowarr(char t[])
	{
		for(int i=0;i<=t.length-1;i++)
		{
			switch(t[i])
			{
			case 'a':case 'A':case'e':case'E':case 'I':case'i':case 'o':case 'O':case 'u':case'U':
				System.out.print(t[i]);
				break;
			default:continue;	
			}
		}
	}
	//concatenate all the characters 
	void concat (char a[],char b[])
	{
		int size=a.length+b.length;
		char x[]=new char[size];
		for(int i=0;i<a.length;i++)
		{
			x[i]=a[i];
		}
		for(int j=0;j<b.length;j++)
		{
			x[a.length+j]=b[j];
		}
		System.out.println("concated array");
		for(char c:x)
		{
			System.out.print(c+" ");
		}
	}
	//2d 3*3 integer array read last row of elements
	void lastrow(int x[][])
	{
		for(int i=0;i<x[2].length;i++)
		{
			System.out.print(x[2][i]+" ");
		}
	}
	//integer elements find the sum of the elements in first row 

	void intsumfarr(int t[][])
	{
		int sum=0;
		for(int i=0;i<t[0].length;i++)
		{
			sum=sum+t[0][i];
		}
		System.out.println(sum);
		System.out.println("+++++++");
	}
	//sub of two matrices in reverse order
	void sub(int x[][],int y[][])
	{
		if((x.length==y.length)&&(x[0].length==y[0].length))
		{
			for(int i=0;i<x.length;i++)
			{
				for(int j=0;j<x[i].length;j++)
				{
					int res=x[i][j]-y[i][j];
					System.out.print(res+" ");
				}
				System.out.println( );
			}
		}
	}
	//string array concatenate all the elements
	void concat(String str[][])
	{
		String s="";
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str[i].length;j++ )
			{
				s=s+str[i][j];
			}
		}
		System.out.println(s);
	}
	//integer array square of the each elements in and find sum
	void squretheelements(int a[])
	{
		int sq[]=new int[a.length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			sq[k]=a[i]*a[i];
			k++;
		}
		int sum=0;
		for(int i=0;i<sq.length;i++)
		{
			sum=sum+sq[i];
		}
		System.out.println("squre of sum of each elements is:"+sum);
	}
}
class Assignmentsmethodsdemo 
{
	public static void main(String[] args) 
	{
		Byteoned obj=new Byteoned();
		byte x[] = {1,2,3,4,5,6,7};
		short y[]= {1,2,3,4,5,6,7,9};
		int q[]= {1,2,3,4,5,6,7,8};
		String str[]= {"sapna","hari","vandhu"};
		int r[]= {10,20,30,40,50};
		char cr[]= {'p','f','a','e','o'};
		char u[]= {'h','a','r','i'};
		char v[]= {'s','a','i'};
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int su[][]={{1,2,3},{4,5,6},{7,8,9}};
		int vu[][]={{3,3,3},{4,7,6},{7,0,9}};
		obj.bytearray(x);
		obj.shortarray(y);
		obj.intarray(q);
		obj.stringarray(str);
		obj.intsumarr(r,0);
		obj.dispvowarr(cr);
		obj.concat(u,v);
		System.out.println();
		System.out.println("only last row");
		obj.lastrow(a);
		System.out.println();
		System.out.println("sum is:");
		obj.intsumfarr(b);
		obj.sub(su,vu);
		System.out.println("CONCAT STRING");
		String o[][]= {{"hi","hello","world"},{"hope","open","hard"},{"joke","hope","kite"}};
		obj.concat(o);
		int t[]={1,2,3};
		obj.squretheelements(t);

	}


}
