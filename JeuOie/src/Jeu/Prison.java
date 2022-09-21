package Jeu;

public class Prison extends Case{
	private Oie dedans;

	public Prison(int numero) {
		super(numero);
		// TODO Auto-generated constructor stub
	}
	
	protected Case arrivee(Oie oie) {
		dedans = oie;
		oie.ajouterMessage(" elle va en prison !");
		return oie.getPlateau().donnerCase(this.numero);
	}
	
	public Case depart(Oie oie) {
		if (dedans != null && dedans.equals(oie)) {
			oie.ajouterMessage("L'oie " + oie.getCouleur() + " est toujours dans la prison...");
			return oie.getPlateau().donnerCase(numero);
		} else {
			oie.ajouterMessage("L'oie " + oie.getCouleur() + " est sur la case " + getNom() + ", ");	
			int valeurDes = oie.lancerDe()+oie.lancerDe();
			oie.ajouterMessage(" elle fait " + valeurDes);
			return caseSuivante(oie, valeurDes+this.numero).arrivee(oie);			
		}
	}
}
