import IN404.exo61.*;


/**
 * Décrivez votre classe Main ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Main
{
    public static void main(String[]args){
    Client c1 = new Client("jo");
    Client c2 = new Client("david");
    Client c3 = new Client("bob");
    
    Serveur s = new Serveur();
    c1.seConnecter(s);
    c2.seConnecter(s);
    c3.seConnecter(s);
    c3.envoyer("bonjour");
}
}
   