import java.util.*;

public class Bibliotheque
{
    private Vector liste;
    
    public Bibliotheque()
    {
        liste = new Vector();
    }
    
    public void ajout(Document d)
    {
        liste.add(d);
    }
    
    /*public Document recherche(String titre)
    {
        Document doc=null;
        int i=0;
        while (true)
        {
            if (liste.doc.titre == titre)
            {
                System.out.println("Document trouvé!");
            }
            doc=liste;
            break;
        }
        return doc;
    }*/
}