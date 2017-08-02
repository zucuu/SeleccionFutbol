package Modelo;

import Interfaces.Actividades;

public class Masajista extends Persona implements Actividades{
	public boolean cremas;

	
	public boolean isCremas() {
		return cremas;
	}

	public void setCremas(boolean cremas) {
		this.cremas = cremas;
	}

	@Override
	public void dialogar() {
		System.out.println("Indica tratamiento");
	}
	
	@Override
	public void concentrar() {
		System.out.println("Piensa que tratamiento realizar");		
	}

	@Override
	public void jugar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void entrenar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dirigir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viajar() {
		System.out.println("Viaja con el equipo");
		
	}

	@Override
	public void darMasajes() {
		System.out.println("Da masajes");
		
	}

}