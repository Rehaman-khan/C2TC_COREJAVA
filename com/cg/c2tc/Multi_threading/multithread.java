package com.cg.c2tc.Multi_threading;
class Eclipse extends Thread{
	public void run() {
		System.out.println("Eclipse Thread ID is "+" "+ Thread.currentThread().getId());
	}
	
	}
class PPT extends Thread{
	public void run() {
		System.out.println("PPT thread ID is " + " " + Thread.currentThread().getId());
	}}
public class multithread{
	public static void main(String[] args) {
		Eclipse obj = new Eclipse();
		obj.start();
		PPT obj1 = new PPT();
		obj1.start();
	}
}