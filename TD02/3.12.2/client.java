public class client
{
    public String nom;
    private Serveur serveur;
}
    public client (String nom)
    {
        this.name;
    }
    
    public boolean seConnecter(Serveur serveur)
    {
        this.serveur = serveur;
        System.out.println(this.nom, "se connecter au serveur");
        return (serveur.connecter(this));
    }
    
    public void envoyer(String message)
    {
        System.out.println(this.nom,"envoie un message au serverur");
        this.serveur.diffuser(message);
    }
    
    public String recevoir(this.nom + " " + message)
    {
        return message;
    }
}