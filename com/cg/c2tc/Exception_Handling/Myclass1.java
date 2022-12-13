package com.cg.c2tc.Exception_Handling;

public class Myclass1 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int x=10;
		int y=0;
		try
		{
			int z=x/y;

		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
