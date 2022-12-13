package com.cg.c2tc.Exception_Handling;

public class Myclass4 {
	public static void main(String[] args) {
		try {
			int arr[]=new int[5];
			arr[7]=100/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("arithmatic exception e");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds Exception error");
		}
		catch(Exception e)
		{
			System.out.println("Parent Exception occurs");
		}
		System.out.println("rest of code");

	}

}
