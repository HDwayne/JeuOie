package Jeu;

public class Jardin extends Case{

	public Jardin(int numero) {
		super(numero);
		// TODO Auto-generated constructor stub
	}
	
	protected Case arrivee(Oie oie) {
		oie.ajouterMessage(" arrive au jardin et gagne !");
		return null;
	}
}
