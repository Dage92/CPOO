
/**
 * Client et serveur.
 */
public class Client
{
    String name;
    boolean is_connected;
    Server connected_server;
    String last_msg;

    /**
     * Constructeur d'objets de classe Client
     */
    public Client(String name)
    {
        this.name = name;
        this.is_connected = false;
        this.last_message = " ";
    }

    public boolean is_connected (Server server)
    {
        if (server.connecter(this))
        {
            this.connected.server = server;
            this.is_connected = true;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void envoyer (String msg)
    {
        this.connected.server.diffuser(this.msg);
    }
    
    public void recevoir(String msg)
    {
        this.last_msg = msg;
    }
    
    public void envoyer (String message)
    {
    }
    
    public void recevoir (String message)
    {
    }
}
