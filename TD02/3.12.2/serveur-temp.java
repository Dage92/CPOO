public class serveur
{
    private Arraylist <client> clients;
    public serveur()
    {
        this.clients = new Arraylist<client>();
    }
    public boolean connecter (Client client)
    {
        if (!(this.clients containts (client))
        {
            this.clients.add(client);
            System.out.println(client.nom+"est connecter au serveur");
            return truel
        }
    }
    