package com.kn.synchronized2;

public class PizzaHouse {
int token;
boolean isAvailable=false;

public synchronized void back(int num) {
	try {
		if(isAvailable==false) {
			token=num;
			System.out.println("Backer is backing for "+token);
			isAvailable=true;
			notify();
		}else {
			wait();
		}
	}catch (InterruptedException e) {
		e.printStackTrace();
	}
}
}
