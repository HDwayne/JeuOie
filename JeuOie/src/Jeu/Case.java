package Jeu;


public class Case {
	protected int numero;

	/**
	 * @param numero
	 */
	public Case(int numero) {
		this.numero = numero;
	}
	
	public String getNom() {
		return "numéro " + (this.numero+1);
	}
	
	public Case depart(Oie oie) {
		oie.ajouterMessage("L'oie " + oie.getCouleur() + " est sur la case " + getNom() + ", ");	
		int valeurDes = oie.lancerDe()+oie.lancerDe();
		oie.ajouterMessage(" elle fait " + valeurDes);
		return caseSuivante(oie, valeurDes+this.numero).arrivee(oie);
	}
	
	protected Case arrivee(Oie oie) {
		oie.ajouterMessage(" elle va sur la case " + getNom());
		return oie.getPlateau().donnerCase(numero);
	}
	
	protected Case caseSuivante(Oie oie, int numCaseDestination) {	
		if (numCaseDestination > 62) {
			return oie.getPlateau().donnerCase(62-(numCaseDestination-62));
		}
		return oie.getPlateau().donnerCase(numCaseDestination);
	}	
}
