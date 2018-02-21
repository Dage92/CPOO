public class serveur
{
    private Arraylist <client> clients;
    public serveur()
    {
        this.clients = new Arraylist<client>();
    }
    public boolean connecter (Client client)
    {
        if (!this.client.contains(client))
        {
            this.clients.add(client);
            System.out.println(client.nom+"est connecter au serveur");
            return true;
        }
    }
    public void diffuser (String message)
    {
        for (client c:client)
        {
            c.serveur(message);
        }
    }
}
/*public Main{
    public static void main(String[]args)
    {
        client c1 = new client("Nathalie");
        client c2 = new client("Lilly");
        client c3 = new client ("Bob");
        Serveur S = new Serveur();
        c1.seconneter(s);
        c2...
        c3...
        c3.envoyer ("bonjour");
    }
}*/