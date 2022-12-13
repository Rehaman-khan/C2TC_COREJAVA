package com.cg.c2tc.Exception_Handling;
import java.util.Scanner;
@SuppressWarnings("serial")
class NamenotFoundException extends Exception{
	 NamenotFoundException(String message)
	{
		super(message);
	}
}

public class Main4 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		try {
			customername(name);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}
         static void customername(String name)throws Exception{
	    if(name.isEmpty()) {
		       throw new Exception("name id empty");
	}
	else {
		System.out.println("Hi"+name+"welcome to our store");
	}
}
	

}
