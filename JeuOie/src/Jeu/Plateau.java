package Jeu;

public class Plateau {
	final private int NB_CASES = 63;
	protected Case[] cases = new Case[NB_CASES];
	/**
	 * @param nB_CASES
	 * @param casses
	 */
	public Plateau() {
		for (int i = 0; i < this.NB_CASES; i++) {
			this.cases[i] = new Case(i);
		}
		initialisationCasesSpecifique();
	}
	
	public Case caseDebutPartie() {
		return this.cases[0];
	}
	
	public Case donnerCase(int i) {
		return this.cases[i];
	}
	
	public void initialisationCasesSpecifique() {
		for (int i = 0; i < cases.length-1; i++) {
			if ((i+1)%9==0) {
				cases[i] = new Fastes(i);
			}
		}
		cases[5] = new Pont(5);
		cases[18] = new Hotel(18);
		cases[30] = new Puits(30);
		cases[41] = new Labyrinthe(41);
		cases[51] = new Prison(51);
		cases[57] = new Mort(57);
		cases[62] = new Jardin(62);
	}
}