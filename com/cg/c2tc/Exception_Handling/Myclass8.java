package com.cg.c2tc.Exception_Handling;
import java.util.Scanner;

@SuppressWarnings("serial")
class InvalidbloodDonateException extends Exception{
	InvalidbloodDonateException(String s){
		super(s);
	}
}

public class Myclass8 {
	static void validate(int age,int weight)throws InvalidbloodDonateException
	{
		if(age<18 && weight<55)
			throw new InvalidbloodDonateException("not eligible");
		else
			System.out.println("can Donate Blood");
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		int weight = sc.nextInt();
		try {
			validate(age,weight);
		}
		catch(Exception m) {
			System.out.println("Exception occured:"+m);
		}
		System.out.println("rest of the code..");
	}

}
