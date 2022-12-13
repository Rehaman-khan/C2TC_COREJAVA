package com.cg.c2tc.Exception_Handling;

public class Main3 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try {
			int i = Integer.parseInt("Thor");
		}
		catch(Exception e)
		{
			System.out.println("this block is handeled all exception types");
		}

	}
}
