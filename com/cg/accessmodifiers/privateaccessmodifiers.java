package com.cg.accessmodifiers;

public class privateaccessmodifiers {
	private int i=10;
	private void show() {
		System.out.println("Hello world");
	}
	public static void main(String[] args) {
		privateaccessmodifiers t1=new privateaccessmodifiers();
		t1.show();
		System.out.println(t1.i);
	}

}
