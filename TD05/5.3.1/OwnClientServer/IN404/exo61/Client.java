package IN404.exo61;

import java.util.*;
import java.lang.*;

/**
 * Write a description of class Client here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Client
{
    // instance variables - replace the example below with your own
    public String nom;
    private Server server;

    /**
     * Constructor for objects of class Client
     */
    public Client(){
        this.nom="";
    }
    
    public Client(String nom)
    {
        // initialise instance variables
        this.nom = nom;
    }

    public boolean se_connecter(Server server){
      this.server = server;
      System.out.println(this.nom + " se connecte au Server");
      return true;
    }

    public void envoyer(String message){
      System.out.println(this.nom + " envoie un message au server");
      this.server.diffuser(message);
    }

    public String recevoir(String message){
      System.out.println(this.nom + ":" + message);
      return message;
    }

}
