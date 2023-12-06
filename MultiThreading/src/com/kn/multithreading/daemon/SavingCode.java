package com.kn.multithreading.daemon;

public class SavingCode extends Thread {
	public void run() {
		for(;;) {
			System.out.println("Saving code");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
