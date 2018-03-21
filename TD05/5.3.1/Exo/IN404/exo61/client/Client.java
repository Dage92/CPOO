package IN404.exo61.client;

import IN404.exo61.serveur.Serveur;

public class Client {
	public String nom;
	private Serveur server;
	private String statut;
	private boolean reception;
	
	public Client(String name) {
		nom = name;
		statut = "déconnecté";
		reception = true;
	}
	
	public boolean seConnecter(Serveur server) {
		System.out.println(this.nom + " se connecte au serveur");
		if(statut.equalsIgnoreCase("déconnecté")) {
			this.server = server;
			this.statut = "connecté";
			return server.connecter(this);
		}
		return false;
	}
	
	public void envoyer(String message) {
		if(statut.equals("connecté")) {
			System.out.println(nom + " a envoyé : " + message);
			this.reception = false;
			server.diffuser(message);
		}
		else System.out.println(nom + " n'a pas pu envoyer de message car il est " + statut);
	}
	
	public void recevoir(String message) {
		if(this.reception) {
			System.out.println(nom + " a reçu un message : " + message);
		}
		else {
			reception = true;
		}
	}
}
