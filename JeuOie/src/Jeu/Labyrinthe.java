package Jeu;

public class Labyrinthe extends Case{

	public Labyrinthe(int numero) {
		super(numero);
		// TODO Auto-generated constructor stub
	}
	
	protected Case arrivee(Oie oie) {
		oie.ajouterMessage(" elle trouve le Labyrinthe et se dirige vers la case 30 !");
		return oie.getPlateau().donnerCase(29);
	}
}
