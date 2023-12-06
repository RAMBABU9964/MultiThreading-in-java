package com.kn.multithradingjoin5;

public class Chatting extends Thread {

	@Override
	public void run() {
		try {
			System.out.println("Charting Started.....");
			Thread.sleep(2000);
			System.out.println("chit chat.....");
			Thread.sleep(2000);
			System.out.println("Charting is ended");
			Thread.sleep(2000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
