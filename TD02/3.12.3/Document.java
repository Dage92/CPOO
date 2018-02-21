public class Document
{
    private String titre;
    private String auteur;
    private int YOP;

    public Document(String titre, String auteur, int YOP)
    {
        this.titre = titre;
        this.auteur = auteur;
        this.YOP = YOP;
    }
    
    public String titre()
    {
        return titre;
    }
    
    public String auteur()
    {
        return auteur;
    }
    
    public int YOP()
    {
        return YOP;
    }
    
    public String description()
    {
        return("'" + titre + "', " + auteur + " " + YOP);
    }
}