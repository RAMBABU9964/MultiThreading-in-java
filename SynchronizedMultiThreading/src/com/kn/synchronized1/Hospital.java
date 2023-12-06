package com.kn.synchronized1;

public class Hospital {
String res1="Docter";
String res2="Bed";

public void treatTom() {
	try {
		synchronized (res1) {
          System.out.println("Tom is using "+res1);
          Thread.sleep(2000);
		synchronized (res2) {
			System.out.println("Tom is using "+res2);
			Thread.sleep(2000);
		}}
		
	}catch (InterruptedException e ) {
		e.printStackTrace();
	}
}
public void treatJeeri() {
	try {
		synchronized (res1) {
          System.out.println("Jeeri is using "+res1);
          Thread.sleep(2000);
		 synchronized (res2) {
			System.out.println("Jeeri is using "+res2);
			Thread.sleep(2000);
		 }}
	}catch (InterruptedException e ) {
		e.printStackTrace();
	}
}

}
