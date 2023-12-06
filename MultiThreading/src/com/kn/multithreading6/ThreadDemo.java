package com.kn.multithreading6;

public class ThreadDemo {

	public static void main(String[] args) {
		//Creating object of Mythread
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
	
	//Setting name of thread
		t1.setName("number");
		t2.setName("character");
		
		
	//Starting threads
		t1.start();
		t2.start();
	}

}
