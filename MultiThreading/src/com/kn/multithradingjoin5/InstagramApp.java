package com.kn.multithradingjoin5;

public class InstagramApp {

	public static void main(String[] args) {
		System.out.println("Instagram Application Starting");
		Chatting c=new Chatting();
		Reels r=new Reels();
		c.start();
		r.start();
		
		
		try {
			c.join();
			r.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
       System.out.println("Instagram Application Ended");
	}

}
