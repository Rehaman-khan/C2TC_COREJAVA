package com.cg.c2tc.Exception_Handling;

public class Myclass5 {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		try {
			String arr[] = new String[10];
			arr = null;
			arr[0] = "one";
			System.out.println(arr[0]);
		}
		catch(Exception ex)
		{
			System.out.println("exception");
		}
			System.out.println("null pointer exception");
		}
}
