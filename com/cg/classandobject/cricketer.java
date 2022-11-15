package com.cg.classandobject;

public class cricketer {
	String name = "Dhoni";

	int age = 39;

	String color = "Brown";

	String role = "Batsman";

	String nationality= "Indian";

	void Display(){

	System.out.println("I LOVE Cricket");

}
public static void main(String args[]){

System.out.println("main methodstarted");

cricketer c = new cricketer();

c.Display ();

System.out.println("main method ended");
}
}
