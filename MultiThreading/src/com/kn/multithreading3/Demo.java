package com.kn.multithreading3;

public class Demo {

	public static void main(String[] args) {
		PrintNumber t1=new PrintNumber();
		t1.start();
		
		
		PrintChar t2=new PrintChar();
		t2.start();

	}

}
