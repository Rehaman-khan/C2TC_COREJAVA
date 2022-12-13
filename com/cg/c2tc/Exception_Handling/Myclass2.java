package com.cg.c2tc.Exception_Handling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
@SuppressWarnings("unused")

public class Myclass2 {
	@SuppressWarnings("resource")
	public void checkFileNotFound()
	{
		try
		{
			FileInputStream var = new FileInputStream("input.txt");
			System.out.println("this is not printed");
		}
		catch (Exception FileNotFoundException)
		{
			System.out.println(FileNotFoundException+"file not found exception ");
		}
	}

	public static void main(String[] args) {
		Myclass2 example = new Myclass2();
		example.checkFileNotFound();

	}

}
