package Jeu;

import java.util.Random;

public class De {
	private int nombre;

	public De() {
		this.nombre=0;
	}
	
	public void lancer() {
		Random random = new Random();
		this.nombre = random.nextInt(6)+1;
	}
	
	public int getNombre() {
		return this.nombre;
	}
}
