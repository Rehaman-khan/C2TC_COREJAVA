package com.cg.c2tc.inter_face;

public class DefaultMethods implements sayable {
	public void sayMore(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		DefaultMethods dm = new DefaultMethods();
		dm.say();
		dm.sayMore("Work is Worship");

	}

}
