package com.cg.c2tc.this_keyword;

public class s2 {
	void m(s2 a) {
		System.out.println("method is invoked");
	}

	void p() {
		m(this);
	}

}
