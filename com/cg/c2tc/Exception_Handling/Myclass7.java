package com.cg.c2tc.Exception_Handling;
import java.io.*;

	class MyMethod{
		void myMethod(int num)throws Exception{
			if(num==1)
			    throw new IOException("IOException Occurred");
			else
				throw new ClassNotFoundException("ClassNotFoundException");

		}
	}
	public class Myclass7 {
		public static void main(String[] args) {
			try {
				MyMethod obj = new MyMethod();
				obj.myMethod(1);
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}


		}

}
