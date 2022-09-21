package Jeu;

public class Hotel extends Case {
	private int temp = 1;
	
	public Hotel(int numero) {
		super(numero);
		// TODO Auto-generated constructor stub
	}

	protected Case arrivee(Oie oie) {
		oie.ajouterMessage(" elle va sur la case hôtel !");
		// return oie.getPlateau().donnerCase(this.numero);
		return new Hotel(this.numero);
	}
	
	public Case depart(Oie oie) {
		if (temp >= 0) {
			oie.ajouterMessage("L'oie " + oie.getCouleur() + " est à l'hôtel pour encore " + this.temp + " tours.");
			temp--;
			// return oie.getPlateau().donnerCase(this.numero);	
			return this;
		} else {
			oie.ajouterMessage("L'oie " + oie.getCouleur() + " est sur la case " + getNom() + ", ");	
			int valeurDes = oie.lancerDe()+oie.lancerDe();
			oie.ajouterMessage(" elle fait " + valeurDes);
			return caseSuivante(oie, valeurDes+this.numero).arrivee(oie);			
		}
	}
}
