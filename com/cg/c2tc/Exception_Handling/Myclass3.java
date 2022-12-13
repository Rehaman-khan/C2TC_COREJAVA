package com.cg.c2tc.Exception_Handling;


public class Myclass3 {
	public static void main(String[] args) {
		Myclass3 ob = new Myclass3();
		try
		{
			ob.meth1();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmatic exception throw by meth() method is caught in main() method");
		}

	}
	public void meth1()
	{
		try
		{
			System.out.println(100/0);
		}
		catch(NullPointerException nullExp)
		{
			System.out.println("we have an exception "+nullExp);

		}
		System.out.println("outside try-catch block");
	}

}
