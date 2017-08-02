package Modelo;

import Interfaces.Actividades;

public class Futbolista extends Persona implements Actividades{
	public String posicion;
	public int numero;
	public boolean estado;
	
	@Override
	public void dialogar() {
		System.out.println("Expone sus motivos");
		
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	@Override
	public void concentrar() {
		System.out.println("Se pone positivo para el proximo partido");
		
	}
	@Override
	public void jugar() {
		System.out.println("Juega el partido");
		
	}
	@Override
	public void entrenar() {
		System.out.println("Se prepara para el proximo partido");
		
	}
	@Override
	public void dirigir() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void viajar() {
		System.out.println("Viaja hacia el club visitante");
		
	}
	@Override
	public void darMasajes() {
		// TODO Auto-generated method stub
		
	}
	
	
}
