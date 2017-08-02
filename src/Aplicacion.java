import Modelo.Entrenador;
import Modelo.Futbolista;
import Modelo.Masajista;

public class Aplicacion {
	public static void main(String[] args) {
		Masajista masajista = new Masajista();
		Entrenador entrenador = new Entrenador();
		Futbolista jugador = new Futbolista();
		
		masajista.setApellido("Castro");
		masajista.setNombre("Grecia");
		masajista.setCremas(true);
		
		entrenador.setApellido("Seijas");
		entrenador.setNombre("Jesus");
		entrenador.setGrado(10);
		
		jugador.setApellido("Ortiz");
		jugador.setNombre("Diego");
		jugador.setEstado(true);
		jugador.setNumero(33);
		jugador.setPosicion("Delantero");
		
		System.out.println("Grandes de Salta");
		
		System.out.print(entrenador.getApellido() + " " + entrenador.getNombre() + " -> ");
		entrenador.dialogar();
		
		System.out.print(jugador.getApellido() + " " + jugador.getNombre() + " -> número " + jugador.getNumero() + " -> ");
		jugador.dialogar();
		
		System.out.print(masajista.getApellido() + " " + masajista.getNombre() + " -> ");
		masajista.dialogar();		
		
	}

}
