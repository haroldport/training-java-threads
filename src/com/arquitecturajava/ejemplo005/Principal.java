package com.arquitecturajava.ejemplo005;

public class Principal {

	public static void main(String[] args) {
		
		long t1 = System.currentTimeMillis();
		Trabajador t = new Trabajador(0);
		Tarea miTarea = new Tarea(t, 5);
		Thread hilo = new Thread(miTarea);
		hilo.start();
		
		Tarea miTarea2 = new Tarea(t, 4);
		Thread hilo2 = new Thread(miTarea2);
		hilo2.start();
		
		try {
			hilo.join();
			hilo2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		long t2 = System.currentTimeMillis();
		System.out.println(t2 - t1);

	}

}
