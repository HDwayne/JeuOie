package Jeu;

public class Test {

	public static void main(String[] args) {
		JeuOie jeuOie = new JeuOie(3);
		jeuOie.ajouterOie("verte");
		jeuOie.ajouterOie("jaune");
		jeuOie.ajouterOie("bleu");
		jeuOie.jouer();
	}

}
