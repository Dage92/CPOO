
/**
 * Décrivez votre classe Server ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
package IN404.exo61;
import java.util.ArrayList;

public class Serveur {
	private ArrayList <Client> client;
	
	public Serveur() {
		client = new ArrayList <Client> ();
	}
	
	public boolean connecter(Client client) {
		this.client.add(client);
		return true;
	}
	
	public void diffuser(String message) {
		int i;
		System.out.println("");
		for(i = 0; i < client.size(); i++) {
			client.get(i).recevoir(message);
		}
		System.out.println("");
	}
}
