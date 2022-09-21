package Jeu;

public class Pont extends Case {

	public Pont(int numero) {
		super(numero);
		// TODO Auto-generated constructor stub
	}
	
	protected Case arrivee(Oie oie) {
		oie.ajouterMessage(" elle trouve le pont et se dirige vers la case 12 !");
		return oie.getPlateau().donnerCase(11);
	}
}
