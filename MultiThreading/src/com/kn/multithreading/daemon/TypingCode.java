package com.kn.multithreading.daemon;

public class TypingCode extends Thread {

	@Override
	public void run() {
		for(;;) {
			System.out.println("Typing code");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
