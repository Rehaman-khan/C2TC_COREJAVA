package com.cg.c2tc.Exception_Handling;

public class Test {
	public static void main(String[] args) {
		try {
			int i=10;
			System.out.println(i);
			return;
		}
		catch(Exception e) {
			System.out.println("catch block");
		}
		finally {
			System.out.println("Finally block");
		}

	}

}
