package IN404.exo61;

import java.util.*;
import java.lang.*;


public class Server
{
    // instance variables - replace the example below with your own
    private ArrayList<Client> clients;

    /**
     * Constructor for objects of class Server
     */
    public Server()
    {
        new ArrayList<Client>();
    }

    public boolean Connecter(Client c){
      this.clients.add(c);
      System.out.println(c.nom + "est connecté au server");
      return true;
    }

    public void diffuser(String message){
        for (Client c :clients){
            c.recevoir(message);
        }
    }
}
