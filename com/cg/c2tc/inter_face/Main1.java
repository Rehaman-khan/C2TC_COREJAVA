package com.cg.c2tc.inter_face;

public class Main1 implements interface1, interface2 {
	public void myMethod() {
		System.out.println("implementing more than one interfaces");
	}

	public static void main(String[] args) {
		Main1 obj = new Main1();
		obj.myMethod();

	}

}
