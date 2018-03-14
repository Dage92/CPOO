import IN404.exo61.client.Client;
import IN404.exo61.serveur.Serveur;
import IN404.exo61.*;

public class Main
{
    public static void main (String[] args)
    {
        Client c1 = new Client("John");
        Client c2 = new Client("Jane");
        Client c3 = new Client("Drake");
        
        Serveur s = new Serveur();
        s.connecter(c1);
        s.connecter(c2);
        c3.seConnecter(s);
        
        c3.envoyer("Bonjour");
    }
}