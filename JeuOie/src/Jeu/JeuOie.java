package Jeu;

public class JeuOie {
	private int nbOie = 0;  
	private De de = new De();
	private Plateau plateau = new Plateau();
	private Oie[] oies;  
	 
	public JeuOie(int nbOieMax) {    
	  oies = new Oie[nbOieMax];
	}
	
	public void ajouterOie(String couleur) {  
	  if (nbOie < oies.length) {
	    oies[nbOie] = new Oie(couleur, plateau, de);
	    nbOie++;
	  }
	}
	
	public void jouer() {
		boolean winner = false;
		while (nbOie>=2 && !winner) {
			nbOie = 0;
			for (int i = 0; i < oies.length; i++) {
				if (!winner && oies[i].action()) {
					nbOie++;
				} else {
					winner = true;
				}
			}
		}
	}

}