package com.arquitecturajava.ejemplo004;

public class Trabajador {
	
	private int dias;

	public Trabajador(int dias) {
		super();
		this.dias = dias;
	}
	
	public synchronized int addDia() {
		this.dias++;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return this.dias;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

}
