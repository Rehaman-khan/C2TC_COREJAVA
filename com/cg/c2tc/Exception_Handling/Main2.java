package com.cg.c2tc.Exception_Handling;

public class Main2 {
	public static void main(String[] args) {
		System.out.println("first line");
		System.out.println("second line");
		try
		{
			int[] myIntArray = new int[] {1,2,3};
			print(myIntArray);
		}catch(Exception e) {
			System.out.println("this array doesnot have fourth line");
		}
		System.out.println("third line");

	}
	public static void print(int[] arr) {
		System.out.println(arr[3]);
	}
}
