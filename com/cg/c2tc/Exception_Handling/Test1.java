package com.cg.c2tc.Exception_Handling;
class Bike{
	public void petrol() {}
}
public class Test1 {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		Bike fz = null;
		try {
			fz.petrol();
		}
		catch(NullPointerException e) {
			System.out.println("there is a nullpointerException");
		}
		catch(Exception e) {
			System.out.println("everthing went fine");
		}

	}

}
