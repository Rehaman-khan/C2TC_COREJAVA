package com.cg.c2tc.Exception_Handling;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("first line");
		System.out.println("second line");
		int[] myIntArray = new int[] {1,2,3};
		print(myIntArray);
		System.out.println("third line");
	}
	public static void print(int[] arr) {
		System.out.println(arr[3]);
		System.out.println("fourth elements successfully displayed");

	}

}
