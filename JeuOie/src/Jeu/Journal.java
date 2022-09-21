package Jeu;

public class Journal {
	private String message;

	public Journal() {
		this.message = "";
	}
	
	
	public void ajouterMessage(String mess) {
		this.message += mess;
	}
	
	public void afficherMessage() {
		System.out.println(this.message);
		this.message = "";
	}
}
