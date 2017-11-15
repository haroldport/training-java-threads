package com.arquitecturajava.ejemplo002;

public class Tarea implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			try {
				System.out.println("Hola tarea: " + Thread.currentThread().getName() + " iteracion: " + i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	

}
