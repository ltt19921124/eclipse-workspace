﻿package testday4;
class FunctionDemo2 
{
	public static void main(String[] args) 
	{		

//		myPrint();
		int x = add(3,5);//绞肉机	
		System.out.println("x="+x);
//		System.out.println(add(3,5));
		myPrint();
	}
	/*
	public static void add(int a,int b)
	{
		System.out.println(a+b);
		return;
	}
	*/

	
	public static int add(int a,int b)
	{
		return a+b;
	}
	/**/


	public static void myPrint()
	{
		System.out.println("Hello World!");
	}
}
