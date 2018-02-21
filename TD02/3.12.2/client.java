public class client
{
    public String nom;
    private Serveur serveur;

    public client (String nom)
    {
        this.nom = nom;
    }
    
    public boolean seConnecter(Serveur serveur)
    {
        this.serveur = serveur;
        System.out.println(this.nom + "se connecter au serveur");
        return (serveur.connecter(this));
    }
    
    public void envoyer(String message)
    {
        System.out.println(this.nom + "envoie un message au serveur");
        this.serveur.diffuser(message);
    }
    
    public void recevoir(String message)
    {
        System.out.println(this.nom + " " + message);
    }
}