package Jeu;

public class Mort extends Case{

	public Mort(int numero) {
		super(numero);
		// TODO Auto-generated constructor stub
	}
	
	protected Case arrivee(Oie oie) {
		oie.ajouterMessage(" elle est morte et se dirige vers la case 30 !");
		return oie.getPlateau().donnerCase(0);
	}
}
