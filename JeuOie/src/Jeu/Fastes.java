package Jeu;

public class Fastes extends Case{

	public Fastes(int numero) {
		super(numero);
		// TODO Auto-generated constructor stub
	}

	protected Case arrivee(Oie oie) {
		oie.ajouterMessage(" elle tombe sur une case fast et rejoue !\n");
		int valeurDes = oie.lancerDe() + oie.lancerDe();
		oie.ajouterMessage(" elle fait " + valeurDes);
		Case next = caseSuivante(oie, valeurDes + this.numero);
		oie.ajouterMessage(" elle va sur la case " + next.getNom());
		return next;
	}
}