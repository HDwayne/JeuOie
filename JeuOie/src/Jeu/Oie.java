package Jeu;

public class Oie {
	private String couleur;
	private De de;
	private Plateau plateau;
	private Case casePlateau;
	private Journal journal = new Journal();
	
	/**
	 * @param couleur
	 * @param plateau
	 * @param here
	 */
	public Oie(String couleur, Plateau plateau, De de) {
		this.couleur = couleur;
		this.plateau = plateau;
		this.de = de;
		this.casePlateau = plateau.caseDebutPartie();
	}

	/**
	 * @return the couleur
	 */
	public String getCouleur() {
		return couleur;
	}

	/**
	 * @return the plateau
	 */
	public Plateau getPlateau() {
		return plateau;
	}
	
	public int lancerDe() {
		de.lancer();
		return this.de.getNombre();
	}
	
	public boolean action() {
		if (this.casePlateau == null)
			return false;
		this.casePlateau = this.casePlateau.depart(this);
		// boolean res = !(this.casePlateau.getNom().equals("numéro 63"));
		boolean res = !(this.casePlateau == null);
		this.journal.afficherMessage();
		return res;
	}
	
	public void ajouterMessage(String message) {
		this.journal.ajouterMessage(message);
	}
}
