import IN404.exo61.Client;
import IN404.exo61.Server;
import IN404.exo61.*;

public class Main
{
    public static void main()
    {
        Server s = new Server();
        Client c1 = new Client("c1");
        Client c2 = new Client("c2");
        Client c3 = new Client("c3");
        
        c1.se_connecter(s);
        c2.se_connecter(s);
        c3.se_connecter(s);
        
        c3.envoyer("Bonjour");
        s.diffuser("Bonjour");
    }
    
}