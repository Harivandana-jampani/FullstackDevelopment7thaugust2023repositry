package com.gentech.constructorchaining;
import java.util.Arrays;

class Ascend
{
 Ascend(int a[])
 {
  Arrays.sort(a);
  System.out.println("sorted array is:"+Arrays.toString(a));
 }
}
public class Ascendingorderdemo {

	public static void main(String[] args) {
  int x[]= {1,6,3,8,4,9};
  Ascend obj=new Ascend(x);
  

 }

}

