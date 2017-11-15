package com.arquitecturajava.ejemplo003;

public class Principal {

	public static void main(String[] args) {
		
		Trabajador t = new Trabajador(0);
		Tarea miTarea = new Tarea(t, 5);
		Thread hilo = new Thread(miTarea);
		hilo.start();
		
		Tarea miTarea2 = new Tarea(t, 4);
		Thread hilo2 = new Thread(miTarea2);
		hilo2.start();

	}

}
