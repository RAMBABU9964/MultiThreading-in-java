package com.kn.multithreadingimp4;
public class ThreadDemo {

	public static void main(String[] args) {
		PrintNumber pn=new PrintNumber();
		PrintChar pc=new PrintChar();
		
		Thread t1=new Thread(pc);
		Thread t2=new Thread(pn);
		t1.start();
		t2.start();

	}

}
