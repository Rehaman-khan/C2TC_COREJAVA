package com.cg.c2tc.polymorphism;

public class student5 {
	int id;
	String name;
	int age;

	student5(int i, String n) {
		id = i;
		name = n;
	}

	student5(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}

	void display() {
		System.out.println(id + " " + name + " " + age);
	}

	public static void main(String[] args) {
		student5 s1 = new student5(111, "salman");
		student5 s2 = new student5(222, "salim", 25);
		s1.display();
		s2.display();

	}

}
