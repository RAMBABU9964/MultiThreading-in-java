package com.kn.multithradingjoin5;

public class Reels extends Thread{
	@Override
	public void run() {
		try {
			System.out.println("Creating reels.....");
			Thread.sleep(2000);
			System.out.println("Uploding reels.....");
			Thread.sleep(2000);
			System.out.println("Sharing the reels");
			Thread.sleep(2000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
