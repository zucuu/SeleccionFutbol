package Modelo;

import Interfaces.Actividades;

public class Entrenador extends Persona implements Actividades{
	public int grado;

	@Override
	public void dialogar() {
		System.out.println("Ofrece un discurso");
	}

	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}

	@Override
	public void concentrar() {
		System.out.println("Piensa tacticas para el proximo partido");
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
		System.out.println("Dirige los jugadores");
		
	}

	@Override
	public void viajar() {
		System.out.println("Viaja donde el equipo juega de visitante");
		
	}

	@Override
	public void darMasajes() {
		// TODO Auto-generated method stub
		
	}	

	}
