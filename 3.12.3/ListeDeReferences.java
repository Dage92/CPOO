import java.util.*;

class ListeDeReferences
{
    private Vector liste;
    private int pos;
    
    public ListeDeReferences()
    {
        liste = new Vector();
    }
    
    public void ajout(Document d)
    {
        liste.add(d);
    }
    
    public void initParcours()
    {
        pos = 0;    
    }
    
    public boolean encore()
    {
        return pos < liste.size();
    }
    
    public Document suivant()
    {
        return (Document) liste.elementAt(pos++);
    }
    public void Affichage() 
    {
        initParcours();
        while (encore())
            System.out.println(suivant().description());
    }
}