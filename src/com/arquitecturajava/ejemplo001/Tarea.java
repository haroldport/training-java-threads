package com.arquitecturajava.ejemplo001;

public class Tarea extends Thread {

	public Tarea(String name) {
		super(name);
	}

	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			try {
				System.out.println("Hola tarea: " + this.getName() + " iteracion: " + i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	

}
