package com.arquitecturajava.ejemplo005;

public class Trabajador {
	
	private int dias;

	public Trabajador(int dias) {
		super();
		this.dias = dias;
	}
	
	public synchronized int addDia() {
		try {
			wait(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.dias++;
		notifyAll();
		return this.dias;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

}
